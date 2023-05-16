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
public class Domicilio {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String calle;
    private Integer altura;

    public Domicilio() {
    }

    public Domicilio(Long id, String calle, Integer altura) {
        this.id = id;
        this.calle = calle;
        this.altura = altura;
    }
    
}
