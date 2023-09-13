package com.javahongkong.bootcamp.exercise;

public class Person extends AccountHolder{
	private String firstName;
	private String lastName;
	// private int idNumber;

	public Person(String firstName, String lastName, int idNumber) {
		super(idNumber);
		this.firstName = firstName;
		this.lastName = lastName; 
		// complete the function
	}

	public String getFirstName() {
		//
		return this.firstName;
	}

	public String getLastName() {
		// complete the function
		return this.lastName;
}
}
