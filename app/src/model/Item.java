package model;

import java.time.LocalDate;

abstract public class Item {
	
	
	protected String title;
	protected String describe;
	protected Double price;
	protected LocalDate dateRelease;
	protected Author author;
	protected String genre;
	protected String publisher;
	protected Boolean isBorrowed;
	
	
	/*
	 * Initializes the item with the attributes needed to compose an item
	 * 
	 *@param title	 		 -> Name of title
	 *@param describe 		 -> Describe of item
	 *@param price			 -> Price of item
	 *@param dateRelease     -> Release date of item
	 *@param author			 -> Author of item
	 *@param genre			 -> Genre of item
	 *@param publisher		 -> Publisher of item
	 */
	
	public Item(String title, String describe, Double price, LocalDate dateRelease, Author author, String genre, String publisher) {
		
		this.setTitle(title);
		this.setDescribe(describe);
		this.setPrice(price);
		this.dateRelease = dateRelease;
		this.author = author;
		this.genre = genre;
		this.publisher = publisher;
		this.isBorrowed = false;
	}
	
	
	/**
	 * @param title -> Title of item
	 * 
	 */
	public void setTitle(String title) {
		
		this.title = title;
	}
	
	/**
	 * 
	 * @return Title of item
	 */
	
	public String getTitle() {
		
		return this.title;
	}
	
	/*
	 * @param describe -> Describe of item
	 */
	public void setDescribe(String describe) {
		
		this.describe = describe;
	}
	
	/*
	 * @return returns the item description
	 */
	public String getDescribe() {
		
		return this.describe;
	}
	
	
	/*
	 *@param -> Price of item
	 */
	public void setPrice(Double price) {
		
		this.price = price;
	}
	
	/*
	 *@return returns the price of item
	 */
	public Double getPrice() {
		
		return this.price;
	}
	
	/*
	 *@return returns the product release date
	 */
	public LocalDate getDateRelease() {
		
		return this.dateRelease;
	}
	
	/*
	 * @return returns the author of item	
	 */
	public Author getAuthor() {
		
		return this.author;
	}
	
	/**
	 * @return returns the genre of item
	 */
	public String getGenre() {
		
		return this.genre;
	}
	
	/*
	 * @return returns the publisher of item
	 */
	public String getPublisher() {
		
		return this.publisher;
	}

	@Override
	public String toString() {
		return "Item [getTitle()=" + getTitle() + ", getDescribe()=" + getDescribe() + ", getPrice()=" + getPrice()
				+ ", getDateRelease()=" + getDateRelease() + ", getAuthor()=" + getAuthor() + ", getGenre()="
				+ getGenre() + ", getPublisher()=" + getPublisher() + "]";
	}
	
	
}
