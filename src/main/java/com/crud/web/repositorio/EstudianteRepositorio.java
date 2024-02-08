
package com.crud.web.repositorio;

import com.crud.web.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repository es para tener el contacto con todos los metodos de la bbdd
@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Integer>{
    
}
