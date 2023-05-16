package com.ejemplo.SpringBoot.controller;

import com.ejemplo.SpringBoot.model.Proyecto;
import com.ejemplo.SpringBoot.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200/"})
public class ProyectoController {
    
    @Autowired
    private IProyectoService proyectServ;
    
    //CRUD Proyectos
    
    @CrossOrigin
    @PostMapping ("/new/proyecto")
    public void agregarProyecto (@RequestBody Proyecto proyect){
        proyectServ.crearProyecto(proyect);
    }
    
    @CrossOrigin
    @PutMapping("/update/proyecto")
    public void udpProyecto(@RequestBody Proyecto proyect) {
        proyectServ.updProyecto(proyect);
	}
    
    @CrossOrigin
    @GetMapping("/listarProyectos")
    public List<Proyecto> listarProyectos() {
          return proyectServ.listarProyecto();
    }
    
}
