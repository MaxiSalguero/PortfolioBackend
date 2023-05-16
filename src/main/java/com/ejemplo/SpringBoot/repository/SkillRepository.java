package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skills, Long> {
    
}

