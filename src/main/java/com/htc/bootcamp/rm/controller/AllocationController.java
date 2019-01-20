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

import com.htc.bootcamp.rm.entity.Allocation;
import com.htc.bootcamp.rm.entity.AllocationIdentitity;
import com.htc.bootcamp.rm.entity.Employee;
import com.htc.bootcamp.rm.entity.Project;
import com.htc.bootcamp.rm.service.AllocationService;
import com.htc.bootcamp.rm.service.EmployeeService;
import com.htc.bootcamp.rm.service.ProjectService;
import com.htc.bootcamp.rm.service.RoleService;

@Controller
public class AllocationController {
	
		@Autowired 
		private EmployeeService employeeService;
		
		@Autowired 
		private ProjectService projectService;
		
		@Autowired 
		private RoleService roleService;
		
		
		@Autowired
		private AllocationService allocationService;
		
		@InitBinder 
		public void dataBinding(WebDataBinder binder) { 
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
		    CustomDateEditor dateEditor = new CustomDateEditor(dateFormat, true); 
		    binder.registerCustomEditor(Date.class, dateEditor); 
		} 
	
		@RequestMapping(value ="/loadAllocations" ,method = RequestMethod.GET)
	    public String loadEmployeePage(Model model) {
			List<Employee> employee=employeeService.findAll();
			List<Project> projects=projectService.findAll();
			model.addAttribute("empList", employee);
			model.addAttribute("projectList",projects);
			model.addAttribute("roleList",roleService.findAll());
		return "allocation" ;
	    }

	  	@RequestMapping(value ="/addAllocation" ,method = RequestMethod.POST)
	    public String createEmployee( @ModelAttribute("allocation") Allocation allocation) {
	  		allocationService.createAllocation(allocation);
	       return "allocationDetails" ;
	    }
	  	
	  	@RequestMapping(value ="/updateAllocation" ,method = RequestMethod.POST)
	    public String updateAllocation( @ModelAttribute("allocation") Allocation allocation) {
	  		allocationService.updateAllocation(allocation);
	       return "allocationDetails" ;
	    }
	  	
	  	@RequestMapping(value="/deleteAllocation",method = RequestMethod.GET)    
	    public String deleteAllocation( AllocationIdentitity id) {
	  		allocationService.deleteAllocation(id);
	       return "allocationDetails" ;
	    }
	  	
		@RequestMapping(value="/displayAllocations",method = RequestMethod.GET)    
	    public String findAll( Model model) {
			List<Allocation> allAllocations=allocationService.findAll();
			model.addAttribute("allAllocations",allAllocations);
	       return "allocationDetails" ;
	    }
		
		@RequestMapping(value="/fetchAllocationByEmployeeId/{id}",method = RequestMethod.GET)    
	    public String findAllAllocationsByManager( @PathVariable int id,Model model) {
			Employee employee =employeeService.getEmployeeById(id);
			List<Allocation> allocaitonsforEmployee =allocationService.findAllocationsByEmployee(employee);
			model.addAttribute("allocaitonsforEmployee",allocaitonsforEmployee);
	       return "allocationDetails" ;
	    }
		
		
	  
}
