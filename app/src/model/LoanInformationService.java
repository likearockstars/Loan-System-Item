package model;

public interface LoanInformationService {
	
	/**
	 * Method responsible for returning the person's loan history
	 * @param person
	 * @return returns a string containing loan information
	 */
	void getInformation(User user);
}
