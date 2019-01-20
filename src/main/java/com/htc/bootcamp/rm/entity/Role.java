package com.htc.bootcamp.rm.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role {
	
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name = "role_id")
	  private Integer  id;
	  
	  @Column(name = "role_title")
	  private String roleTitle;
	  
	 
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Role(String roleTitle) {
		super();
		this.roleTitle = roleTitle;
	}


	public String getRoleTitle() {
		return roleTitle;
	}


	public void setRoleTitle(String roleTitle) {
		this.roleTitle = roleTitle;
	}


	@Override
	public String toString() {
		return "Role [id=" + id + ", roleTitle=" + roleTitle + "]";
	}

	

	
}
