package com.javahongkong.bootcamp.exercise;

public class Company extends AccountHolder{
	private String companyName;

	public Company(String companyName, int taxId) {
		super(taxId);
		this.companyName = companyName;
		// complete the function
	}

	public String getCompanyName() {
		// complete the function

		return this.companyName;
	}
}
