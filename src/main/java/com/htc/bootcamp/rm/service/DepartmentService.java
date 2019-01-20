package com.htc.bootcamp.rm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.htc.bootcamp.rm.entity.Department;

@Service
public interface DepartmentService {
	
	Department getDepartmentById(Integer id);
	 
	Department createDepartment(Department department);
 
	Department updateDepartment(Department department);
 
    void deleteDepartment(Integer id);
    
    List<Department> findAll();

}
