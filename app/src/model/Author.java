package model;

import java.time.LocalDate;

public class Author extends Person {
	
	private Integer idAuthor;
	private String pseudonomy;
	
	
	/**
	 * @param pseudonomy
	 */
	/**
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param email
	 * @param pseudonomy
	 * @param idAuthor
	 */
	public Author(String firstName, String lastName,LocalDate birthDate, String email, String pseudonomy, Integer idAuthor) {
		
		// Constructor of super class Person
		super(firstName,lastName,birthDate,email);
		this.setPseudonomy(pseudonomy);
		this.idAuthor = idAuthor;
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
	
	/**
	 * @return Returns the identification of the author
	 */
	public Integer getIdAuthor() {
		
		return this.idAuthor;
	}

	@Override
	public String toString() {
		return "Author [getPseudonoym()=" + getPseudonoym() + "]";
	}

	
}
