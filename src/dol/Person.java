package dol;

public abstract class Person {
	
	private String firstName;
	private String middleName;
	private String surName;
	private String SecondSurName;
	private String nationality;
	
	
	public Person() {
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getSurName() {
		return surName;
	}


	public void setSurName(String surName) {
		this.surName = surName;
	}


	public String getSecondSurName() {
		return SecondSurName;
	}


	public void setSecondSurName(String secondSurName) {
		SecondSurName = secondSurName;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	
	
	

}
