package model;

import java.time.LocalDate;

public class DVD  extends Item{
	
	private Integer numberDVD;
	private String recordLabel;
	private Integer numberTracks;
	
	
	/**
	 * @param title
	 * @param describe
	 * @param price
	 * @param dateRelease
	 * @param author
	 * @param genre
	 * @param publisher
	 */
	public DVD(Integer idItem,String title, String describe, Double price, LocalDate dateRelease,Author author, String genre, String publisher,Integer numberDVD,String recordLabel,Integer numberTracks) {
		
		super(idItem,title,describe,price,dateRelease,author,genre,publisher);
		this.numberDVD = numberDVD;
		this.setRecordLabel(recordLabel);
		this.setNumberTracks(numberTracks);
	}
	
	/**
	 * @return Returns the DVD number
	 */
	public Integer getNumberDVD() {
		
		return this.numberDVD;
	}
	
	/**
	 * Sets the name of the record company that recorded the DVD
	 * @param recordLabel 

	 */
	public void setRecordLabel(String recordLabel) {
		
		this.recordLabel = recordLabel;
	}
	
	/**
	 * @return Returns the record label
	 */
	public String getRecordLabel() {
		
		return this.recordLabel;
	
	}
	
	/**
	 * Set the number of songs in DVD
	 * @param numberTracks
	 */
	public void setNumberTracks(Integer numberTracks) {
		
		this.numberTracks = numberTracks;
	}
	
	/**
	 * @return Returns the number of songs
	 */
	public Integer getNumberTracks() {
		
		return this.numberTracks;
	}

	@Override
	public String toString() {
		return "DVD [numberDVD=" + numberDVD + ", recordLabel=" + recordLabel + ", numberTracks=" + numberTracks
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
