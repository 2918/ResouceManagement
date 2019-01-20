package com.htc.bootcamp.rm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htc.bootcamp.rm.entity.Employee;
import com.htc.bootcamp.rm.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired 
	private EmployeeRepository employeeRepoitory;

	public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepoitory.findById(id).orElse(null);
	}

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepoitory.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepoitory.save(employee);
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		employeeRepoitory.deleteById(id);
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> allEmployees= new ArrayList<>();
		employeeRepoitory.findAll().forEach(e->allEmployees.add(e));
		return allEmployees;
	}

	@Override
	public List<Employee> findByDepartmentId(Integer id) {
		List<Employee> allEmployees= new ArrayList<>();
		employeeRepoitory.findByDepartmentId(id);
		return null;
	}

	@Override
	public List<Employee> findByManagerId(Integer mangerId) {
		// TODO Auto-generated method stub
		return employeeRepoitory.findByManagerId(mangerId);
	}

}
