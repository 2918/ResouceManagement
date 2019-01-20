package com.htc.bootcamp.rm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.htc.bootcamp.rm.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	public List<Employee> findByDepartmentId(Integer deptId);
	public List<Employee> findByManagerId(Integer mangerId);
}
