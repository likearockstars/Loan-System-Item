package model;

import java.time.LocalDateTime;

public interface LoanService {

	/**
	 * Method responsible for being a generic loan items
	 * 
	 * @param item
	 * @param person
	 */
	void loanItem(Item item, User user,LocalDateTime returnDate);
	void returnItem(Item person,User user);
}
