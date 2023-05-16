package com.ejemplo.SpringBoot.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre;
    private String apellido;
    private String acercaDe;
    private String url_foto;
    private String ubicacion;
    private String ocupacion;
    
    public Persona(){
        super();
    }

    public Persona(long id, String nombre, String apellido, String acercaDe, String url_foto, String ubicacion, String ocupacion) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.acercaDe = acercaDe;
        this.url_foto = url_foto;
        this.ubicacion = ubicacion;
        this.ocupacion = ocupacion;
    }
    
}
