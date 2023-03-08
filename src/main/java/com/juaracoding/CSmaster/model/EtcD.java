package com.juaracoding.CSmaster.model;
/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author Farhan a.k.a Muhammad Farhan Kamil
Java Developer
Created On 07/03/2023 00:04
@Last Modified 07/03/2023 00:04
Version 1.0
*/


import org.springframework.stereotype.Component;

@Component
public class EtcD {
	Customer currentState;
	Customer desiredState;

	public Customer getCurrentState() {
		return currentState;
	}

	public void setCurrentState(Customer currentState) {
		this.currentState = currentState;
	}

	public Customer getDesiredState() {
		return desiredState;
	}

	public void setDesiredState(Customer desiredState) {
		this.desiredState = desiredState;
	}
}
