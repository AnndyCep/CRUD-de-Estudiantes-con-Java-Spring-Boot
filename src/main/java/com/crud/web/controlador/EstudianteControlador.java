
package com.crud.web.controlador;

import com.crud.web.entities.Estudiante;
import com.crud.web.servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class EstudianteControlador {
    
    
    @Autowired
    private EstudianteServicio servicio;
    
    @GetMapping
    public String listarEstudiantes(Model model){
        
        model.addAttribute("estudiante",servicio.listarTodos());
        return "estudiantes";  //retorna la el template.
    }
    
    @GetMapping("/nuevo")
    public String nuevoEstudiante(Model model){
        //Creamos un objet vacion
        Estudiante estudiante = new Estudiante();
        
        
        return "";
    }
    
}
