package com.htc.bootcamp.rm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.htc.bootcamp.rm.entity.Department;
import com.htc.bootcamp.rm.entity.Project;
import com.htc.bootcamp.rm.entity.Role;

@Service
public interface RoleService {
	
	Role getRoleById(Integer id);
	 
	Role createRole(Role role);
 
	Role updateRole(Role role);
 
    void deleteRole(Integer id);
    
    List<Role> findAll();

}
