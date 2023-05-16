package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Proyecto;
import com.ejemplo.SpringBoot.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {

    @Autowired
    public ProyectoRepository proyectRepo;
    
    @Override
    public List<Proyecto> listarProyecto() {
        return proyectRepo.findAll();
    }
    
    @Override
    public void crearProyecto(Proyecto proyect) {
        proyectRepo.save(proyect);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectRepo.deleteById(id);
    }
 
    @Override
    public Proyecto getProyecto(Long id) {
        return proyectRepo.findById(id).orElse(null);
    }
    
    @Override
    public Proyecto updProyecto(Proyecto proyect) {
	return proyectRepo.save(proyect);
    }
}