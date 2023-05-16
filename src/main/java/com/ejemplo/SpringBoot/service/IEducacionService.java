package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> listarEducacion();
    public Educacion getEducacion(Long id);
    public void crearEducacion(Educacion edu);  
    public void borrarEducacion(Long id);
    public Educacion updEducacion(Educacion edu);
     
}