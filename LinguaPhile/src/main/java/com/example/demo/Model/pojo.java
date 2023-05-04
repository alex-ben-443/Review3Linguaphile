package com.example.demo.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LP")
public class pojo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String course;
	private String role;
	@Column(unique = true)
	private String uname;
	private String pwd;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "pd_column")
	private PersonalDetails pdetails;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public PersonalDetails getPdetails() {
		return pdetails;
	}
	public void setPdetails(PersonalDetails pdetails) {
		this.pdetails = pdetails;
	}
	public pojo()
	{
		super();
	}
	@Override
	public String toString() {
		return "pojo [id=" + id + ", name=" + name + ", course=" + course + ", role=" + role + ", uname=" + uname
				+ ", pwd=" + pwd + ", pdetails=" + pdetails + "]";
	}
	
}
