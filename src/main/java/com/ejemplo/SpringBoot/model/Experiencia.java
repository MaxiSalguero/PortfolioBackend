package com.ejemplo.SpringBoot.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String url_logo;
    private String experiencia;
    private String compania;
    private String fecha_inicio;
    private String fecha_fin;
    private String localidad;

    public Experiencia() {
    }
    
}