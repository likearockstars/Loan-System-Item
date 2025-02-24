package model;

import java.time.LocalDateTime;

import exception.ItemNotFoundException;
import exception.LoanException;

public interface LoanService {

	/**
	 * Method responsible for being a generic loan items
	 * 
	 * @param item
	 * @param person
	 * @throws LoanException 
	 */
	void loanItem(Item item, User user,LocalDateTime returnDate) throws LoanException, ItemNotFoundException;
	void returnItem(Item person,User user);
}
