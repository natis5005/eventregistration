package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Id;

import javax.persistence.Entity;

@Entity
public class Person {
	private String name;

	public void setName(String value) {
		this.name = value;
	}

	@Id
	public String getName() {
		return this.name;
	}

	private String address;

	public void setAddress(String value) {
		this.address = value;
	}

	public String getAddress() {
		return this.address;
	}
}
