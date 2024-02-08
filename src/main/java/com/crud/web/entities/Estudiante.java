
package com.crud.web.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//anotacion para convertir la entridad en tabla en nuestra bd
@Entity
@Table(name ="Estudiante") // anotacion para darle el nombre a la base de datos
@Data // generar todos los setter y getters
@AllArgsConstructor // genera un construtor con todos atributos
@NoArgsConstructor //Genera un construsctor vacio

public class Estudiante {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // anotacion para asignar el id de forma automatica
    private int id_estudiante;
    
    @Column(name = "Nombre", nullable = false) // anotacion para darle el nombre a la columna y que no sea null
    private String nombre;
    
    @Column(name = "Apellido", nullable = false)
    private String apellido;
    
    @Column(name = "email", nullable = false, unique = true) // anotacion para que solo se pueda ingresar un correo por usuario
    private String email;

    
}
