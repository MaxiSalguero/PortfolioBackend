package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Skills;
import java.util.List;

public interface ISkillService {
    
    public List<Skills> listarSkill();
    public Skills getSkills(Long id);
    public void crearSkill(Skills skil);  
    public void borrarSkill(Long id);
    public Skills updSkill(Skills skil);
     
}
