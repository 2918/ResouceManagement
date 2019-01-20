package com.htc.bootcamp.rm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.htc.bootcamp.rm.entity.Department;
import com.htc.bootcamp.rm.entity.Project;
import com.htc.bootcamp.rm.entity.Role;
import com.htc.bootcamp.rm.entity.Skill;

@Service
public interface SkillService {
	
	Skill getSkillById(Integer id);
	 
	Skill createSkill(Skill skill);
 
	Skill updateSkill(Skill skill);
 
    void deleteSkill(Integer id);
    
    List<Skill> findAll();

}
