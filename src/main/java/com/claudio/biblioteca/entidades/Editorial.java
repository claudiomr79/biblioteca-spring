package com.claudio.biblioteca.entidades;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Editorial {
   
    @Id
    @GeneratedValue(generator = "uuid") // Hibernate genera un UUID
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String nombre;

    public Editorial() {
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
