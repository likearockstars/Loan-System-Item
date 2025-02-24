package factory;

import java.time.LocalDate;

import model.Author;
import model.Book;
import model.DVD;
import model.Magazine;

public class ItemFactory {
	
	private static ItemFactory instanceItemFactory;
	
	private ItemFactory() {}
	
	/**
	 * @return Utilizamos o padrão Singleton
	 */
	public static synchronized ItemFactory getInstance() {
		
		instanceItemFactory = (instanceItemFactory == null) ? new ItemFactory() : null;
		return instanceItemFactory;
	}
	
	/**
	 * @param idItem
	 * @param title
	 * @param describe
	 * @param price
	 * @param author
	 * @param dateRelease
	 * @param genre
	 * @param publisher
	 * @param ISBN
	 * @param pageCounts
	 * @return Responsible for creating an instance of a book
	 */
	public Book createBook(Integer idItem, String title, String describe, Double price, Author author, LocalDate dateRelease, String genre, String publisher, String ISBN, Integer pageCounts) {
		return new Book(idItem,title,describe,price,dateRelease,author,genre,publisher,ISBN,pageCounts);
	}
	
	/**
	 * @param idItem
	 * @param title
	 * @param describe
	 * @param price
	 * @param author
	 * @param dateRelease
	 * @param genre
	 * @param publisher
	 * @param editionNumber
	 * @param numberPages
	 * @return Responsible for creating an instance of a magazine
	 */
	public Magazine createMagazine(Integer idItem, String title, String describe, Double price, Author author, LocalDate dateRelease, String genre, String publisher, 
	Integer editionNumber, Integer numberPages) {
		return new Magazine(idItem, title, describe, price, dateRelease, author, genre, publisher, editionNumber, numberPages);
	}
	
	/**
	 * @param idItem
	 * @param title
	 * @param describe
	 * @param price
	 * @param author
	 * @param dateRelease
	 * @param genre
	 * @param publisher
	 * @param numberDVD
	 * @param recordLabel
	 * @param numberTracks
	 * @return Responsible for creating an instance of a DVD
	 */
	public DVD createDVD(Integer idItem, String title, String describe, Double price, Author author, LocalDate dateRelease, String genre, String publisher,
	Integer numberDVD, String recordLabel, Integer numberTracks) {
		return new DVD(idItem, title, describe, price, dateRelease, author, genre, publisher, numberDVD, recordLabel, numberTracks);
	}

}
