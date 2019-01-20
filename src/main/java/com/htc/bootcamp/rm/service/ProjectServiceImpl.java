/**
 * 
 */
package com.htc.bootcamp.rm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.htc.bootcamp.rm.entity.Department;
import com.htc.bootcamp.rm.entity.Project;
import com.htc.bootcamp.rm.repository.DepartmentRepository;
import com.htc.bootcamp.rm.repository.ProjectRepository;

/**
 * @author Jayaprakash 
 *
 */
@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired 
	private ProjectRepository projectRepoitory;

	
	@Override
	public List<Project> findAll() {
		 List<Project> allProjects= new ArrayList<>();
		 projectRepoitory.findAll().forEach(e->allProjects.add(e));
		return allProjects;
	}

	@Override
	public Project getProjectById(Integer id) {
		// TODO Auto-generated method stub
		return projectRepoitory.findById(id).orElse(null);		
	}

	@Override
	public Project createProject(Project project) {
		// TODO Auto-generated method stub
		return projectRepoitory.save(project);
	}

	@Override
	public Project updateProject(Project project) {
		// TODO Auto-generated method stub
		return projectRepoitory.save(project);
	}

	@Override
	public void deleteProject(Integer id) {
		projectRepoitory.deleteById(id);
		
	}

}
