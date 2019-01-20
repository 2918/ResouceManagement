package com.htc.bootcamp.rm.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class AllocationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="emp_id")
	private Integer empId;

	@Column(name="project_id")
	private Integer projectId;

	@Column(name="role_id")
	private Integer roleId;

	@Temporal(TemporalType.DATE)
	@Column(name="from_date")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private java.util.Date fromDate;

	public AllocationPK() {
	}
	public Integer getEmpId() {
		return this.empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Integer getProjectId() {
		return this.projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public Integer getRoleId() {
		return this.roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public java.util.Date getFromDate() {
		return this.fromDate;
	}
	public void setFromDate(java.util.Date fromDate) {
		this.fromDate = fromDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AllocationPK)) {
			return false;
		}
		AllocationPK castOther = (AllocationPK)other;
		return 
			this.empId.equals(castOther.empId)
			&& this.projectId.equals(castOther.projectId)
			&& this.roleId.equals(castOther.roleId)
			&& this.fromDate.equals(castOther.fromDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.empId.hashCode();
		hash = hash * prime + this.projectId.hashCode();
		hash = hash * prime + this.roleId.hashCode();
		hash = hash * prime + this.fromDate.hashCode();
		
		return hash;
	}
}