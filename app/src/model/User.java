package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User<T> extends Person {

	
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
}
