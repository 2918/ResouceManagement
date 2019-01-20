package com.htc.bootcamp.rm.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Skill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="skill_id")
	private Integer skillId;

	@Column(name="skill_name")
	private String skillName;

	//bi-directional many-to-many association to Employee
	@ManyToMany
	@JoinTable(
		name="employeeskill"
		, joinColumns={
			@JoinColumn(name="skill_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="emp_id")
			}
		)
	private List<Employee> employees;

	public Skill() {
	}

	public Integer getSkillId() {
		return this.skillId;
	}

	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return this.skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillName=" + skillName + ", employees=" + employees + "]";
	}	
	
	
	
}
