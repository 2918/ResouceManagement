package com.htc.bootcamp.rm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.htc.bootcamp.rm.entity.Allocation;
import com.htc.bootcamp.rm.entity.AllocationIdentitity;
import com.htc.bootcamp.rm.entity.Employee;

@Service
public interface AllocationService {

	Allocation getAllocationById(AllocationIdentitity Id);
	 
	Allocation createAllocation(Allocation allocation);
 
	Allocation updateAllocation(Allocation allocation);
 
    void deleteAllocation(AllocationIdentitity Id);
    
    List<Allocation> findAll();
    List<Allocation> findAllocationsByEmployee(Employee emp);
}
