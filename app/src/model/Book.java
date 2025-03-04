package model;

import java.time.LocalDate;

public class Book extends Item{
	
	private String ISBN;
	private Integer pageCounts;
	
	/**
	 * @param IdItem
	 * @param title
	 * @param describe
	 * @param price
	 * @param dateRelease
	 * @param author
	 * @param genre
	 * @param publisher
	 * @param ISBN
	 * @param pageCounts
	 */
	public Book(Integer idItem,String title, String describe, Double price,LocalDate dateRelease, Author author, String genre, String publisher,String ISBN, Integer pageCounts) {
		
		super(idItem,title,describe,price, dateRelease,author,genre,publisher);
		this.ISBN = ISBN;
		this.pageCounts = pageCounts;
	}
	
	/**
	 * @return returns identification of book
	 */
	public String getISBN() {
		
		return this.ISBN;
	}
	
	/*
	 * @return Returns the number of pages in the book
	 */
	public Integer getPageCounts() {
		
		return this.pageCounts;
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", pageCounts=" + pageCounts + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	

}
