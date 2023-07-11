package com.springcore.annatation.config.bean;

public class Emp {

	private Samosa samosa;

	public Samosa getSamosa() {

		return samosa;
	}


	public void setSamosa(Samosa samosa) {

		this.samosa = samosa;

	}
	
	public Emp(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	@Override
	public String toString() {
		return "Emp [samosa=" + samosa + "]";
	}

	public void comapy() {

		samosa.dispaly(); // method call 
		
		System.out.println("am working as a software developer coming from Emp class");
	}

}
