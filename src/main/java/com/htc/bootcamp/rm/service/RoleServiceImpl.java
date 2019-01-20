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
import com.htc.bootcamp.rm.entity.Role;
import com.htc.bootcamp.rm.repository.DepartmentRepository;
import com.htc.bootcamp.rm.repository.ProjectRepository;
import com.htc.bootcamp.rm.repository.RoleRepository;

/**
 * @author Jayaprakash 
 *
 */
@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired 
	private RoleRepository roleRepoitory;

	
	@Override
	public List<Role> findAll() {
		 List<Role> allProjects= new ArrayList<>();
		 roleRepoitory.findAll().forEach(e->allProjects.add(e));
		return allProjects;
	}

	@Override
	public Role getRoleById(Integer id) {
		// TODO Auto-generated method stub
		return roleRepoitory.findById(id).orElse(null);		
	}

	@Override
	public Role createRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepoitory.save(role);
	}

	@Override
	public Role updateRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepoitory.save(role);
	}

	@Override
	public void deleteRole(Integer id) {
		roleRepoitory.deleteById(id);
		
	}

}
