package com.htc.bootcamp.rm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.htc.bootcamp.rm.entity.Employee;

@Service
public interface EmployeeService {

	Employee getEmployeeById(Integer id);
	 
	Employee createEmployee(Employee employee);
 
	Employee updateEmployee(Employee employee);
 
    void deleteEmployee(Integer id);
    
    List<Employee> findAll();
    List<Employee> findByDepartmentId(Integer id);
    List<Employee> findByManagerId(Integer mangerId);
}
