
package com.crud.web.controlador;

import com.crud.web.entities.Estudiante;
import com.crud.web.servicio.EstudianteServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EstudianteControlador {
    
    
    @Autowired
    private EstudianteServicio servicio;
    
    @GetMapping
    public String listarEstudiantes(Model model){
        List<Estudiante> listaEstudiante = servicio.listarTodos();
        model.addAttribute("listaEstudiantes", listaEstudiante);
        return "estudiantes";  //retorna la el template.
    }
    
    @GetMapping("/nueva")
    public String nuevoEstudiante(Model model){
        //Creamos un objet vacion
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudiante);
        model.addAttribute("accion","/nueva");
        
        return "formulario";
    }
    
    @PostMapping("/nueva")
    public String guardarEstudiante(@ModelAttribute Estudiante estudiante){
        servicio.crearEstudiante(estudiante);
        return "redirect:/";
    }
}
