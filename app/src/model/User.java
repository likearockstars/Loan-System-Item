package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User extends Person {

	
	private Integer idUser;
	private List<LoanItem> loans = new ArrayList<LoanItem>();
	

	/**
	 * @param idUser
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param email
	 */
	public User(String firstName, String lastName, LocalDate birthDate, String email,Integer idUser) {
		super(firstName,lastName,birthDate,email);
		this.idUser = idUser;
	}
	
	
	/**
	 * @return Returns a list of items
	 */
	public List<LoanItem> getLoans(){
		
		return this.loans;
	}
	
	/**
	 * 
	 * @return Returns a identification of user
	 */
	public Integer getIdUser() {
		
		return this.idUser;
	}


	@Override
	public String toString() {
		return "User [getLoans()=" + getLoans() + ", getIdUser()=" + getIdUser() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getLocalDate()=" + getLocalDate() + ", getEmail()="
				+ getEmail() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	
}
