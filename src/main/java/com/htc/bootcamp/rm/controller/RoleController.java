package com.htc.bootcamp.rm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.htc.bootcamp.rm.entity.Role;
import com.htc.bootcamp.rm.service.RoleService;

@Controller
public class RoleController {
	
		@Autowired 
		private RoleService roleService;
		
		
	
		@RequestMapping(value ="/loadRole" ,method = RequestMethod.GET)
	    public String loadDepartmentPage() {
	       return "role" ;
	    }

	  	@RequestMapping(value ="/addRole" ,method = RequestMethod.POST)
	    public String createProject( @ModelAttribute("role") Role role) {
	  		roleService.createRole(role);
	       return "roleDetails" ;
	    }
	  	
	  	@RequestMapping(value ="/updateRole" ,method = RequestMethod.POST)
	    public String updateProject( @ModelAttribute("role") Role role) {
	  		roleService.updateRole(role);
	       return "roleDetails" ;
	    }
	  	
	  	@RequestMapping(value="/deleteRole/{id}",method = RequestMethod.GET)    
	    public String deleteProject( @PathVariable int id) {
	  		roleService.deleteRole(id);
	       return "roleDetails" ;
	    }
	  	
		@RequestMapping(value="/displayRoles",method = RequestMethod.GET)    
	    public String findAll( Model model) {
			List<Role> allRoles=roleService.findAll();
			model.addAttribute("allRoles",allRoles);
	       return "roleDetails" ;
	    }
	  
}
