package com.htc.bootcamp.rm.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	  @Id
	  @Column(name = "dept_id")
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer  id;
	  
	  @Column(name = "Dept_Name")
	  private String deptName;
	  
	  public List<Employee> getEmployee() {
		return employees;
	}


	public void setEmployee(List<Employee> employee) {
		this.employees = employee;
	}

	@Column(name = "Dept_Location")
	  private String deptLocation;
	  
	 //set of employees one to many 
	@OneToMany(mappedBy="department")
	private List<Employee> employees;



	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Department(String deptName, String deptLocation) {
		super();
		this.deptName = deptName;
		this.deptLocation = deptLocation;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLocation() {
		return deptLocation;
	}

	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", deptName=" + deptName + ", deptLocation=" + deptLocation + "]";
	}
	  
	  

}
