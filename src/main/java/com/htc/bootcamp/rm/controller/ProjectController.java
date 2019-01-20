package com.htc.bootcamp.rm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.htc.bootcamp.rm.entity.Project;
import com.htc.bootcamp.rm.service.ProjectService;

@Controller
public class ProjectController {
	
		@Autowired 
		private ProjectService projectService;
		
		@InitBinder 
		public void dataBinding(WebDataBinder binder) { 
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
		    CustomDateEditor dateEditor = new CustomDateEditor(dateFormat, true); 
		    binder.registerCustomEditor(Date.class, dateEditor); 
		} 

	
		@RequestMapping(value ="/loadProject" ,method = RequestMethod.GET)
	    public String loadDepartmentPage() {
	       return "project" ;
	    }

	  	@RequestMapping(value ="/addProject" ,method = RequestMethod.POST)
	    public String createProject( @ModelAttribute("project") Project project) {
	  		projectService.createProject(project);
	       return "projectDetails" ;
	    }
	  	
	  	@RequestMapping(value ="/updateProject" ,method = RequestMethod.POST)
	    public String updateProject( @ModelAttribute("project") Project project) {
	  		projectService.updateProject(project);
	       return "projectDetails" ;
	    }
	  	
	  	@RequestMapping(value="/deleteProject/{id}",method = RequestMethod.GET)    
	    public String deleteProject( @PathVariable int id) {
	  		projectService.deleteProject(id);
	       return "projectDetails" ;
	    }
	  	
		@RequestMapping(value="/displayProjects",method = RequestMethod.GET)    
	    public String findAll( Model model) {
			List<Project> allProjects=projectService.findAll();
			model.addAttribute("allProjects",allProjects);
	       return "projectDetails" ;
	    }
	  
}
