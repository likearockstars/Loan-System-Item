package model;

import java.time.LocalDate;

abstract public class Person {
	
	protected String firstName;
	protected String lastName;
	protected LocalDate birthDate;
	protected String email;
	
	/**
	 * @param firstName		-> First name of user
	 * @param lastName		-> Last name of user
	 * @param birthDate		-> Birthday date
	 * @param email			-> Email of user
	 */
	public Person(String firstName, String lastName,LocalDate birthDate, String email) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.setEmail(email);
	}
	
	/**
	 * @return First name of user
	 */
	public String getFirstName() {
		
		return this.firstName;
	}
	
	/**
	 * @return Last name of user
	 */
	public String getLastName() {
		
		return this.lastName;
	}
	
	/**
	 * @return Returns the date of birth
	 */
	public LocalDate getLocalDate() {
		
		return this.birthDate;
	}
	
	/**
	 * @param Configure the user´s email
	 */
	public void setEmail(String email) {
		
		this.email = email;
	}
	
	/**
	 * @return returns the user´s email
	 */
	public String getEmail() {
		
		return this.email;
	}

	@Override
	public String toString() {
		return "Person [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getLocalDate()="
				+ getLocalDate() + ", getEmail()=" + getEmail() + "]";
	}
	
	
	
	

}
