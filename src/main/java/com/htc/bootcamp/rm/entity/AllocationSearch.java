package com.htc.bootcamp.rm.entity;

import java.util.Date;

public class AllocationSearch {

	
	
	private String clientName;
	private String projectName;
	private Date fromDate;
	private Date toDate;
	private String role;
	
	public AllocationSearch() {
		// TODO Auto-generated constructor stub
	}

	public AllocationSearch(String clientName, String projectName, Date fromDate, Date toDate, String role) {
		super();
		this.clientName = clientName;
		this.projectName = projectName;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.role = role;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "AllocationSearch [clientName=" + clientName + ", projectName=" + projectName + ", fromDate=" + fromDate
				+ ", toDate=" + toDate + ", role=" + role + "]";
	}
	
	

}
