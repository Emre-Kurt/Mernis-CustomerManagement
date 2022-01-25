package Entities;

import Abstract.Entity;

public class Customer implements Entity {

	 int id;
	 String firstName;
	 String lastName;
	 int dateOfBirth;
	 String nationality›d;
	
	
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationality›d) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationality›d = nationality›d;
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
	public String getNationality›d() {
		return nationality›d;
	}
	public void setNationality›d(String nationality›d) {
		this.nationality›d = nationality›d;
	}
	
}
