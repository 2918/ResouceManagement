/**
 * 
 */
package com.htc.bootcamp.rm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htc.bootcamp.rm.entity.Skill;
import com.htc.bootcamp.rm.repository.SkillRepository;

/**
 * @author Jayaprakash 
 *
 */
@Service
public class SkillServiceImpl implements SkillService {
	
	@Autowired 
	private SkillRepository skillRepoitory;

	
	@Override
	public List<Skill> findAll() {
		 List<Skill> allProjects= new ArrayList<>();
		 skillRepoitory.findAll().forEach(e->allProjects.add(e));
		return allProjects;
	}

	@Override
	public Skill getSkillById(Integer id) {
		// TODO Auto-generated method stub
		return skillRepoitory.findById(id).orElse(null);		
	}

	@Override
	public Skill createSkill(Skill skill) {
		// TODO Auto-generated method stub
		return skillRepoitory.save(skill);
	}

	@Override
	public Skill updateSkill(Skill skill) {
		// TODO Auto-generated method stub
		return skillRepoitory.save(skill);
	}

	@Override
	public void deleteSkill(Integer id) {
		skillRepoitory.deleteById(id);
		
	}

}
