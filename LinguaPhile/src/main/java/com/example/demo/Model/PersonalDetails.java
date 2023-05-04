package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LP_Details")
public class PersonalDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String gender;
	private int age;
	private String native_language;
	private String nationality;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNative_language() {
		return native_language;
	}
	public void setNative_language(String native_language) {
		this.native_language = native_language;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "PersonalDetails [id=" + id + ", gender=" + gender + ", age=" + age + ", native_language="
				+ native_language + ", nationality=" + nationality + "]";
	}
	
}
