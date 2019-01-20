package com.htc.bootcamp.rm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.htc.bootcamp.rm.entity.Skill;
import com.htc.bootcamp.rm.service.SkillService;

@Controller
public class SkillController {
	
		@Autowired 
		private SkillService skillService;
		
		
	
		@RequestMapping(value ="/loadSkill" ,method = RequestMethod.GET)
	    public String loadSkillPage() {
	       return "skill" ;
	    }

	  	@RequestMapping(value ="/addSkill" ,method = RequestMethod.POST)
	    public String createSkill( @ModelAttribute("skill") Skill skill) {
	  		skillService.createSkill(skill);
	       return "skillDetails" ;
	    }
	  	
	  	@RequestMapping(value ="/updateSkill" ,method = RequestMethod.POST)
	    public String updateSkill( @ModelAttribute("skill") Skill skill) {
	  		skillService.updateSkill(skill);
	       return "skillDetails" ;
	    }
	  	
	  	@RequestMapping(value="/deleteSkill/{id}",method = RequestMethod.GET)    
	    public String deleteSkill( @PathVariable int id) {
	  		skillService.deleteSkill(id);
	       return "skillDetails" ;
	    }
	  	
		@RequestMapping(value="/displaySkills",method = RequestMethod.GET)    
	    public String findAll( Model model) {
			List<Skill> allSkills=skillService.findAll();
			model.addAttribute("allSkills",allSkills);
	       return "skillDetails" ;
	    }
	  
}
