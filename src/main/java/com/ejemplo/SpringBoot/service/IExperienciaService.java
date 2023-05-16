
package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Experiencia;
import java.util.List;

public interface IExperienciaService {

    public List<Experiencia> listarExperiencias();
    public Experiencia getExperiencia(Long id);
    public void crearExperiencia(Experiencia exp);  
    public void borrarExperiencia(Long id);
    public Experiencia updExperiencia(Experiencia exp);
     
}
