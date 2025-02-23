package model;

public interface ServiceLoan {

	/**
	 * Method responsible for being a generic loan items
	 * 
	 * @param item
	 * @param person
	 */
	void loanItem(Item item, Person person);
	void developeItem(Item item, Person person);
}
