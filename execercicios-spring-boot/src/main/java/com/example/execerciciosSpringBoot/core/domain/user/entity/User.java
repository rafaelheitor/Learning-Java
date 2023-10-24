package com.example.execerciciosSpringBoot.core.domain.user.entity;

import java.time.LocalDate;

public class User {

	private Long id;
	private String name;
	private String email;
	private String password;
	private LocalDate dob;
	private int age;
	
	public User() {
	}

	public User(Long id, String name, String email, String password, LocalDate dob, int age) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.age = age;
	}

	public User(String name, String email, String password, LocalDate dob, int age) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public LocalDate getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", dob=" + dob
				+ ", age=" + age + "]";
	}

}
