
package com.crud.web.servicio;

import com.crud.web.entities.Estudiante;
import java.util.List;



//Interfaz donde se genera la logica de negocio
public interface EstudianteServicio {
    
    //metodo abstracto listar todos los estudiantes
    List<Estudiante> listarTodos();
    
    //Metodo abstracto para encontrar solo un estudiante
    Estudiante encontrarEstudinte(int id_estudiante);
    
    //Metodo abstracto para crear un nuebo estudiante
    Estudiante crearEstudiante(Estudiante estudiante);
    
    //Metodo abstracto para actualizar estudiante
    Estudiante actualizarEstudiante(int id_estudiante, Estudiante estudiante);
    
    ///Metodo abstracto para eliminar estudiante
    void eliminarEstudiante(int id_estudiante);
    
    
}
