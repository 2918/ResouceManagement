package com.htc.bootcamp.rm.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Allocation {


	 @EmbeddedId
	 private AllocationIdentitity allocationIdentitity;
	 
	 	@Column(name="emp_id", insertable=false, updatable=false)
		private Integer empId;

		public Integer getEmpId() {
			return empId;
		}


		public void setEmpId(Integer empId) {
			this.empId = empId;
		}


		public Integer getProjectId() {
			return projectId;
		}


		public void setProjectId(Integer projectId) {
			this.projectId = projectId;
		}


		public Integer getRoleId() {
			return roleId;
		}


		public void setRoleId(Integer roleId) {
			this.roleId = roleId;
		}


		@Column(name="project_id", insertable=false, updatable=false)
		private Integer projectId;

		@Column(name="role_id", insertable=false, updatable=false)
		private Integer roleId;
	 
	 @Column(name = "to_date")
	 @Temporal(TemporalType.DATE)
	 @DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date toDate;
	 @Column(name = "amount_perday")
	private Integer amountPerDay;
	
	
	public Allocation() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Allocation(AllocationIdentitity allocationIdentitity, Date toDate, Integer amountPerDay) {
		super();
		this.allocationIdentitity = allocationIdentitity;
		this.toDate = toDate;
		this.amountPerDay = amountPerDay;
	}


	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public Integer getAmountPerDay() {
		return amountPerDay;
	}
	public void setAmountPerDay(Integer amountPerDay) {
		this.amountPerDay = amountPerDay;
	}


	public AllocationIdentitity getAllocationIdentitity() {
		return allocationIdentitity;
	}


	public void setAllocationIdentitity(AllocationIdentitity allocationIdentitity) {
		this.allocationIdentitity = allocationIdentitity;
	}


	@Override
	public String toString() {
		return "Allocation [allocationIdentitity=" + allocationIdentitity + ", toDate=" + toDate + ", amountPerDay="
				+ amountPerDay + "]";
	}
	
	
	

}
