package com.htc.bootcamp.rm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.htc.bootcamp.rm.entity.Department;
import com.htc.bootcamp.rm.entity.Project;

@Service
public interface ProjectService {
	
	Project getProjectById(Integer id);
	 
	Project createProject(Project project);
 
	Project updateProject(Project project);
 
    void deleteProject(Integer id);
    
    List<Project> findAll();

}
