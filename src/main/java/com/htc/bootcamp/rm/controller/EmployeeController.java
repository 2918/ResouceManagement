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

import com.htc.bootcamp.rm.entity.Department;
import com.htc.bootcamp.rm.entity.Employee;
import com.htc.bootcamp.rm.service.DepartmentService;
import com.htc.bootcamp.rm.service.EmployeeService;

@Controller
public class EmployeeController {
	
		@Autowired 
		private EmployeeService employeeService;
		
		@Autowired
		private DepartmentService deptService;
		
		@InitBinder 
		public void dataBinding(WebDataBinder binder) { 
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
		    CustomDateEditor dateEditor = new CustomDateEditor(dateFormat, true); 
		    binder.registerCustomEditor(Date.class, dateEditor); 
		} 
	
		@RequestMapping(value ="/loadEmployee" ,method = RequestMethod.GET)
	    public String loadEmployeePage(Model model) {
			List<Department> depts=deptService.findAll();
			model.addAttribute("deptList",depts);
		return "employee" ;
	    }

	  	@RequestMapping(value ="/addEmployee" ,method = RequestMethod.POST)
	    public String createEmployee( @ModelAttribute("employee") Employee employee) {
	  		employeeService.createEmployee(employee);
	       return "employeeDetails" ;
	    }
	  	
	  	@RequestMapping(value ="/updateEmployee" ,method = RequestMethod.POST)
	    public String updateEmployee( @ModelAttribute("employee") Employee employee) {
	  		employeeService.updateEmployee(employee);
	       return "employeeDetails" ;
	    }
	  	
	  	@RequestMapping(value="/deleteEmployee/{id}",method = RequestMethod.GET)    
	    public String deleteEmployee( @PathVariable int id) {
	  		employeeService.deleteEmployee(id);
	       return "employeeDetails" ;
	    }
	  	
		@RequestMapping(value="/displayEmployees",method = RequestMethod.GET)    
	    public String findAll( Model model) {
			List<Employee> allEmployees=employeeService.findAll();
			model.addAttribute("allEmployees",allEmployees);
	       return "employeeDetails" ;
	    }
		
		@RequestMapping(value="/fetchEmployeeByManager/{id}}",method = RequestMethod.GET)    
	    public String findAllEmployeesByManager( @PathVariable int id,Model model) {
			List<Employee> allEmployees=employeeService.findByManagerId(id);
			model.addAttribute("employeesbyMa",allEmployees);
	       return "employeeDetails" ;
	    }
		
		@RequestMapping(value="/fetchEmployeeByDeptId/{id}",method = RequestMethod.GET)    
	    public String findAllEmployeesByDeptId(@PathVariable int id, Model model) {
			List<Employee> allEmployees=employeeService.findByDepartmentId(id);
			model.addAttribute("employeesbyDeptId",allEmployees);
	       return "employeeDetails" ;
	    }
	  
}
