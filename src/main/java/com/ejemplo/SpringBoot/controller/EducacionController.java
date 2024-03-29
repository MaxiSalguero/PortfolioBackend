
package com.ejemplo.SpringBoot.controller;

import com.ejemplo.SpringBoot.model.Educacion;
import com.ejemplo.SpringBoot.service.IEducacionService;
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
public class EducacionController {
    
    @Autowired
    private IEducacionService eduServ;
    
    //CRUD Educacion
    
    @PostMapping ("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping("/listarEducacion")
    public List<Educacion> listarEducacion() {
          return eduServ.listarEducacion();
    }
    
    @GetMapping ("/getEducacion/{id}")
    public Educacion getEducacion(@PathVariable Long id) {
          return eduServ.getEducacion(id);
    }
    
    @PutMapping("/update/educacion")
    public void udpEducacion(@RequestBody Educacion edu) {
	eduServ.updEducacion(edu);
	}
    
    @DeleteMapping("/delete-edu/{id}")
    public void borrarEducacion (@PathVariable Long id){
       eduServ.borrarEducacion(id);
    }
    
}
