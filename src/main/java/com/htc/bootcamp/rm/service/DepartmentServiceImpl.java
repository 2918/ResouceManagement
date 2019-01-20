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
import com.htc.bootcamp.rm.repository.DepartmentRepository;

/**
 * @author Jayaprakash 
 *
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired 
	private DepartmentRepository deptRepoitory;

	@Override
	public Department getDepartmentById(Integer id) {
		return deptRepoitory.findById(id).orElse(null);		
	}

	@Override
	public Department createDepartment(Department department) {
		// TODO Auto-generated method stub
		return deptRepoitory.save(department);
	}

	@Override
	public Department updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return deptRepoitory.save(department);
	}

	@Override
	public void deleteDepartment(Integer id) {
			deptRepoitory.deleteById(id);
		return;
	}

	@Override
	public List<Department> findAll() {
		 List<Department> allDepts= new ArrayList<>();
		 deptRepoitory.findAll().forEach(e->allDepts.add(e));
		return allDepts;
	}

}
