package model;

import java.time.LocalDate;

public class Magazine extends Item {
	
	private Integer numberEdition;
	private Integer numberPages;
	
	/**
	 * @param IdItem
	 * @param title
	 * @param describe
	 * @param price
	 * @param dateRelease
	 * @param author
	 * @param genre
	 * @param publisher
	 */
	public Magazine(Integer idItem,String title, String describe, Double price, LocalDate dateRelease, Author author, String genre, String publisher,Integer numberEdition,Integer numberPages) {
		
		super(idItem,title,describe,price,dateRelease,author,genre,publisher);
		this.numberEdition = numberEdition;
		this.numberPages = numberPages;
	}
	
	/**
	 * @return Returns the number edition
	 */
	public Integer getNumberEdition() {
		
		return this.numberEdition;
	}
	
	/**
	 * @return Returns the number pages of book
	 */
	public Integer getNumberPages() {
		
		return this.numberPages;
	}
	

	@Override
	public String toString() {
		return "Magazine [numberEdition=" + numberEdition + ", numberPages=" + numberPages + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
