package com.ejemplo.SpringBoot.controller;

import com.ejemplo.SpringBoot.model.Experiencia;
import com.ejemplo.SpringBoot.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200/"})
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expServ;
    
    //CRUD Experiencia
    
    @PostMapping ("/new/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping("/listarExperiencias")
    public List<Experiencia> listarExperiencias() {
          return expServ.listarExperiencias();
    }
    
    @CrossOrigin
    @GetMapping ("/getExperiencia/{id}")
    public Experiencia getExperiencia(@PathVariable Long id) {
          return expServ.getExperiencia(id);
    }
    
    @CrossOrigin
    @PutMapping("/update/experiencia")
    public void udpExperiencia(@RequestBody Experiencia exp) {
	expServ.updExperiencia(exp);
	}
    
    @DeleteMapping("/delete-exp/{id}")
    public void borrarExperiencia (@PathVariable Long id){
       expServ.borrarExperiencia(id);
    }
    
    
}
