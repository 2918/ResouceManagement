package com.htc.bootcamp.rm.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Employee {
	
	@Id
	  @Column(name = "emp_id")
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer  id;
		
	  @Column(name = "emp_name")
	  private String empName;
	  
	  @Column(name = "hiredate")
	  @Temporal(TemporalType.DATE)
	  @DateTimeFormat(pattern = "dd-MM-yyyy")
	  private Date hireDate;
	  
	  @Column(name = "salary")
	  private Double salary;
	  
	//  @ManyToOne(cascade={CascadeType.ALL})
	//  @JoinColumn(name="mgr_id")
	  @Column(name = "mgr_id")
	  private Integer  managerId;
	  	 
	  @ManyToOne
	  @JoinColumn(name="dept_id")
	  private Department department;
	  
	  
	  @ManyToMany(mappedBy="employees")
	  Set<Skill> skills = new HashSet<>();


	public Employee() {
		// TODO Auto-generated constructor stub
	}

	

	public Employee(String empName, Date hireDate, Double salary, Integer managerId, Department department,
			Set<Skill> skills) {
		super();
		this.empName = empName;
		this.hireDate = hireDate;
		this.salary = salary;
		this.managerId = managerId;
		this.department = department;
		this.skills = skills;
	}



	public Set<Skill> getSkills() {
		return skills;
	}


	public void setSkills(Set<Skill> skills) {
		this.skills = skills;
	}


	


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Date getHireDate() {
		return hireDate;
	}


	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Integer getManagerId() {
		return managerId;
	}


	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", hireDate=" + hireDate + ", salary=" + salary
				+ ", managerId=" + managerId + ", department=" + department + ", skills=" + skills + "]";
	}


	
   
   
 

}
