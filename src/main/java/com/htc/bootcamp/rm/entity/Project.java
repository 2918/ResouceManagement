package com.htc.bootcamp.rm.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Project {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name = "project_id")
	  private Integer  id;
	  
	  @Column(name = "project_Name")
	  private String projectName;
	  
	  @Column(name = "client_Name")
	  private String clientName;
	  
	  @Column(name = "deadline")
	  @Temporal(TemporalType.DATE)
	  @DateTimeFormat(pattern = "dd-MM-yyyy")
	  private Date endDate;
	 //set of employees one to many 

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String projectName, String clientName, Date endDate) {
		super();
		this.projectName = projectName;
		this.clientName = clientName;
		this.endDate = endDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", clientName=" + clientName + ", endDate="
				+ endDate + "]";
	}
	



	
}
