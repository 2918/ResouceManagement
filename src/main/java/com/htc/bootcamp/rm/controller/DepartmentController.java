package com.htc.bootcamp.rm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.htc.bootcamp.rm.entity.Department;
import com.htc.bootcamp.rm.service.DepartmentService;

@Controller
public class DepartmentController {
	
		@Autowired 
		private DepartmentService deptService;
	
		@RequestMapping(value ="/loadDept" ,method = RequestMethod.GET)
	    public String loadDepartmentPage() {
	       return "dept" ;
	    }

	  	@RequestMapping(value ="/addDept" ,method = RequestMethod.POST)
	    public String createDepartment( @ModelAttribute("dept") Department dept) {
	  		deptService.createDepartment(dept);
	       return "deptDetails" ;
	    }
	  	
	  	@RequestMapping(value ="/updateDept" ,method = RequestMethod.POST)
	    public String updateDepartment( @ModelAttribute("dept") Department dept) {
	  		deptService.updateDepartment(dept);
	       return "deptDetails" ;
	    }
	  	
	  	@RequestMapping(value="/deleteDept/{id}",method = RequestMethod.GET)    
	    public String deleteDepartment( @PathVariable int id) {
	  		deptService.deleteDepartment(id);
	       return "deptDetails" ;
	    }
	  	
		@RequestMapping(value="/displayDepartments",method = RequestMethod.GET)    
	    public String findAll( Model model) {
			List<Department> allDepts=deptService.findAll();
			model.addAttribute("allDepartments",allDepts);
	       return "deptDetails" ;
	    }
	  
}
