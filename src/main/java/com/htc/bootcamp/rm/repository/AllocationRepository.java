package com.htc.bootcamp.rm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.htc.bootcamp.rm.entity.Allocation;
import com.htc.bootcamp.rm.entity.AllocationIdentitity;
import com.htc.bootcamp.rm.entity.Employee;

public interface AllocationRepository extends CrudRepository<Allocation, AllocationIdentitity> {
	
	List<Allocation> findByAllocationIdentitityEmployee(Employee employee);

}
