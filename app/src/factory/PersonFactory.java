package factory;

import java.time.LocalDate;

import model.Author;
import model.User;

public class PersonFactory {
	
	private static PersonFactory instancePersonFactory;
	
	private PersonFactory() {}
	
	// Utilizando o padrão singleton
	public static PersonFactory getInstance() {
		
		instancePersonFactory  = (instancePersonFactory == null) ? new PersonFactory() : null;
		return instancePersonFactory;
	}
	
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param email
	 * @param idUser
	 * @return Responsible for creating an instance of a user
	 */
	public User createUser(String firstName, String lastName, LocalDate birthDate, String email, Integer idUser) {
		return new User(firstName, lastName, birthDate, email, idUser);
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param email
	 * @param pseudonomy
	 * @param idAuthor
	 * @return Responsible for creating an instance of author
	 */
	public Author createAuthor(String firstName, String lastName, LocalDate birthDate, String email, String pseudonomy, Integer idAuthor) {
		
		return new Author(firstName, lastName, birthDate, email, pseudonomy, idAuthor);
	}

}
