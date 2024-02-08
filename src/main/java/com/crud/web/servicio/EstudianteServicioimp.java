
package com.crud.web.servicio;

import com.crud.web.entities.Estudiante;
import com.crud.web.repositorio.EstudianteRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//Donde se implementan casa uno de los servicios creados en la interfaz
@Service
public class EstudianteServicioimp implements EstudianteServicio{

    
    @Autowired//Se inyecta las dependencias para acceder a la BBDD
    private EstudianteRepositorio repositorio;
    
    
    @Override
    public List<Estudiante> listarTodos() {
        return repositorio.findAll();
    }

    @Override
    public Estudiante encontrarEstudinte(int id_estudiante) {
        return repositorio.findById(id_estudiante).orElse(null);
    }

    @Override
    public Estudiante crearEstudiante(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }

    @Override
    public Estudiante actualizarEstudiante(int id_estudiante, Estudiante estudiante) {
        
        //Se crea un objeto donde se almacena el objeto de la base de datos
        Estudiante estudiantebbdd = repositorio.findById(id_estudiante).orElse(null);
        
        // Se valida que si el obtejo tiene datos entra a la condicion
        if (estudiantebbdd != null) {
            //Se setean los datos
            estudiantebbdd.setNombre(estudiante.getNombre());
            estudiantebbdd.setApellido(estudiante.getApellido());
            estudiantebbdd.setEmail(estudiante.getEmail());
            repositorio.save(estudiantebbdd);
        }
        return null;
    }

    @Override
    public void eliminarEstudiante(int id_estudiante) {
        repositorio.deleteById(id_estudiante);
    }

    
    
}
