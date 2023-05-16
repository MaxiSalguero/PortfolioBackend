package com.ejemplo.SpringBoot.controller;

import com.ejemplo.SpringBoot.model.Skills;
import com.ejemplo.SpringBoot.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class SkillController {
    
    @Autowired
    private ISkillService skillServ;
    
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
