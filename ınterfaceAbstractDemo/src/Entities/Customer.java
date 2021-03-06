package Entities;

import Abstract.Entity;

public class Customer implements Entity {

	 int id;
	 String firstName;
	 String lastName;
	 int dateOfBirth;
	 String nationalityİd;
	
	
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityİd) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityİd = nationalityİd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityİd() {
		return nationalityİd;
	}
	public void setNationalityİd(String nationalityİd) {
		this.nationalityİd = nationalityİd;
	}
	
}
