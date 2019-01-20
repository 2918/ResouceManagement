package com.htc.bootcamp.rm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htc.bootcamp.rm.entity.Allocation;
import com.htc.bootcamp.rm.entity.AllocationIdentitity;
import com.htc.bootcamp.rm.entity.Employee;
import com.htc.bootcamp.rm.repository.AllocationRepository;

@Service
public class AllocationServiceImpl implements AllocationService {
	
	@Autowired
	private AllocationRepository allocationRepository;

	public AllocationServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Allocation getAllocationById(AllocationIdentitity Id) {
		
		return allocationRepository.findById(Id).orElse(null);
	}

	@Override
	public Allocation createAllocation(Allocation allocation) {
		// TODO Auto-generated method stub
		return allocationRepository.save(allocation);
	}

	@Override
	public Allocation updateAllocation(Allocation allocation) {
		// TODO Auto-generated method stub
		return allocationRepository.save(allocation);
	}

	@Override
	public void deleteAllocation(AllocationIdentitity Id) {
		allocationRepository.deleteById(Id);
	}

	@Override
	public List<Allocation> findAll() {
		List<Allocation> allAllocations= new ArrayList<>();
		allocationRepository.findAll().forEach(e->allAllocations.add(e));
		return allAllocations;
	}

	@Override
	public List<Allocation> findAllocationsByEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return allocationRepository.findByAllocationIdentitityEmployee(employee);
	}

}
