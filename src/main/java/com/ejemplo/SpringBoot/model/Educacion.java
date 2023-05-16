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
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String url_logo;
    private String institucion;
    private String titulo;
    private String fecha_inicio;
    private String fecha_fin;

    public Educacion() {
    }

    public Educacion(Long id, String url_logo, String institucion, String titulo, String fecha_inicio, String fecha_fin) {
        this.id = id;
        this.url_logo = url_logo;
        this.institucion = institucion;
        this.titulo = titulo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }


   
}