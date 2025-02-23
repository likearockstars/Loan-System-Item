package model;

import java.time.LocalDate;

public class Author extends Person {
	
	private String pseudonomy;
	
	
	/**
	 * @param pseudonomy
	 */
	public Author(Integer idUser, String firstName, String lastName,LocalDate birthDate, String email, String pseudonomy) {
		
		// Constructor of super class Person
		super(idUser,firstName,lastName,birthDate,email);
		this.setPseudonomy(pseudonomy);
	}
	
	/**
	 * @param Set the author´s pseudonym
	 */
	public void setPseudonomy(String pseudonomy) {
		
		this.pseudonomy = pseudonomy;
	}
	
	/**
	 * @return Returns the pseudonmy of the author
	 */
	public String getPseudonoym() {
		
		return this.pseudonomy;
	}

	@Override
	public String toString() {
		return "Author [getPseudonoym()=" + getPseudonoym() + "]";
	}

	
}
