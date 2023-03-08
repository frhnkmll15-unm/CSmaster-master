package com.juaracoding.CSmaster.model;
/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author Farhan a.k.a Muhammad Farhan Kamil
Java Developer
Created On 07/03/2023 00:02
@Last Modified 07/03/2023 00:02
Version 1.0
*/


import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Table(name = "MstCustomer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "FirstName", nullable = false)
	private String firstName;
	@Column(name = "Lastname", nullable = false)
	private String lastName;
	@Column(name = "Email", nullable = false)
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

