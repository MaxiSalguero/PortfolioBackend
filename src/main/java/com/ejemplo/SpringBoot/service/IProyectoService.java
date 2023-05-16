package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    
    public List<Proyecto> listarProyecto();
    public Proyecto getProyecto(Long id);
    public void crearProyecto(Proyecto proyect);  
    public void borrarProyecto(Long id);
    public Proyecto updProyecto(Proyecto proyect);
     
}
