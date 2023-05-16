package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Skills;
import com.ejemplo.SpringBoot.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService {

    @Autowired
    public SkillRepository skillRepo;
    
    @Override
    public List<Skills> listarSkill() {
        return skillRepo.findAll();
    }
    
    @Override
    public void crearSkill(Skills skill) {
        skillRepo.save(skill);
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }
 
    @Override
    public Skills getSkills(Long id) {
        return skillRepo.findById(id).orElse(null);
    }
    
    @Override
    public Skills updSkill(Skills skill) {
	return skillRepo.save(skill);
    }
}
