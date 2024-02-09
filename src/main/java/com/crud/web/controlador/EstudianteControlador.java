
package com.crud.web.controlador;

import com.crud.web.entities.Estudiante;
import com.crud.web.servicio.EstudianteServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EstudianteControlador {
    
    
    @Autowired
    private EstudianteServicio servicio;
    //Listar los estudiantes
    @GetMapping
    public String listarEstudiantes(Model model){
        List<Estudiante> listaEstudiante = servicio.listarTodos();
        model.addAttribute("listaEstudiantes", listaEstudiante);
        return "estudiantes";  //retorna la el template.
    }
    //Mostrar el formulario  para crear estudiante
    @GetMapping("/nueva")
    public String nuevoEstudiante(Model model){
        //Creamos un objet vacion
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudiante);
        model.addAttribute("accion","/nueva");
        
        return "formulario";
    }
    //Metodo para guardar el estudiante en la bbdd
    @PostMapping("/nueva")
    public String guardarEstudiante(@ModelAttribute Estudiante estudiante){
        servicio.crearEstudiante(estudiante);
        return "redirect:/";
    }
    //ostar formulario para actualizar datos de usuario
    @GetMapping("/editar/{id}")
    public String mostrarEditarEstudiante(@PathVariable int id, Model model){
        Estudiante estudiante = servicio.encontrarEstudinte(id);
        model.addAttribute("estudiante", estudiante);
        model.addAttribute("accion", "/editar/" + id);
        return "actualizar_estudiante";
    }
    //Actulizar los datos que se envias desde el formulario
    @PostMapping("/editar/{id}")
    public String actualizarEstudiante(@PathVariable int id, @ModelAttribute Estudiante estudiante){
        servicio.actualizarEstudiante(id, estudiante);
        return "redirect:/";
    }
    //Eliminar estudiante
    @GetMapping("/eliminar/{id}")
    public String eliminarEstudiante(@PathVariable int id){
        servicio.eliminarEstudiante(id);
        return "redirect:/";
    }
}
