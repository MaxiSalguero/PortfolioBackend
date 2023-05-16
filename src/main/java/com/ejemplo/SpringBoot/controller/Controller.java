package com.ejemplo.SpringBoot.controller;

import com.ejemplo.SpringBoot.model.Educacion;
import com.ejemplo.SpringBoot.model.Experiencia;
import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.model.Proyecto;
import com.ejemplo.SpringBoot.model.Skills;
import com.ejemplo.SpringBoot.service.IEducacionService;
import com.ejemplo.SpringBoot.service.IExperienciaService;
import com.ejemplo.SpringBoot.service.IPersonaService;
import com.ejemplo.SpringBoot.service.IProyectoService;
import com.ejemplo.SpringBoot.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
        
    @Autowired
    private IEducacionService eduServ;
    
    @Autowired
    private IExperienciaService expServ;
    
    @Autowired
    private IProyectoService proyectServ;
    
    @Autowired
    private ISkillService skillServ;
    
    //CRUD Persona
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    @CrossOrigin
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @CrossOrigin
    @GetMapping("/getPersona/{id}")
    public Persona pers(@PathVariable Long id) {	
            return persoServ.getPersona(id);
	}
    
    @CrossOrigin
    @PutMapping("/update/persona")
    public void udpPersona(@RequestBody Persona persona) {
	persoServ.updPersona(persona);
	}
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
       persoServ.borrarPersona(id);
    }
    
    //CRUD Educacion
    
    @PostMapping ("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @CrossOrigin
    @GetMapping("/listarEducacion")
    public List<Educacion> listarEducacion() {
          return eduServ.listarEducacion();
    }
    
    @CrossOrigin
    @GetMapping ("/getEducacion/{id}")
    public Educacion getEducacion(@PathVariable Long id) {
          return eduServ.getEducacion(id);
    }
    
    @CrossOrigin
    @PutMapping("/update/educacion")
    public void udpEducacion(@RequestBody Educacion edu) {
	eduServ.updEducacion(edu);
	}
    
    @DeleteMapping("/delete-edu/{id}")
    public void borrarEducacion (@PathVariable Long id){
       eduServ.borrarEducacion(id);
    }
    
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
    
    //CRUD Skills
    
    @CrossOrigin
    @PostMapping ("/new/skill")
    public void agregarSkill (@RequestBody Skills skil){
        skillServ.crearSkill(skil);
    }
    
    @CrossOrigin
    @PutMapping("/update/skill")
    public void udpSkill(@RequestBody Skills skil) {
        skillServ.updSkill(skil);
	}
    
    @CrossOrigin
    @GetMapping("/listarSkill")
    public List<Skills> listarSkill() {
          return skillServ.listarSkill();
    }
    
}
