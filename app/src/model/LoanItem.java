package model;

import java.time.LocalDateTime;

/**
 * Essa classe vai ser responsável por ser a abstração da ação do mundo real de um usuário indo até uma biblioteca fazer um empréstimo, ele irá guardar o identificador do usuário e do item
 *, a data em que o item foi retirado é a data em que o produto irá ser devolvido.
 */

public class LoanItem {
	
	private Integer idUser;
	private Integer idItem;
	private LocalDateTime loanDate;
	private LocalDateTime returnDate;
	
	/**
	 * @param idUser
	 * @param idItem
	 * @param loanDater
	 */
	public LoanItem(Integer idUser, Integer idItem,LocalDateTime returnDate) {
		
		this.idUser = idUser;
		this.idItem = idItem;
		this.loanDate = LocalDateTime.now();
		this.setReturnDate(returnDate);
		
	}
	
	
	/**
	 * @return returns the identification of user
	 */
	public Integer getIdUser() {
		
		return this.idUser;
	}
	
	/**
	 * @return returns the identification of item
	 */
	public Integer getIdItem() {
		
		return this.idItem;
	}
	
	/**
	 * @return returns the loan date of item
	 */
	public LocalDateTime getLoanDate() {
		
		return this.loanDate;
	}
	
	/**
	 * Set the item return date
	 * @param returnDate
	 */
	
	public void setReturnDate(LocalDateTime returnDate) {
		
		this.returnDate = returnDate;
	}
	
	/**
	 * @return returns the return date of item
	 */
	public LocalDateTime getReturnDate() {
		
		return this.returnDate;
	}


	@Override
	public String toString() {
		return "LoanItem [idUser=" + idUser + ", idItem=" + idItem + ", loanDate=" + loanDate + ", returnDate="
				+ returnDate + "]";
	}
	
	
	
	
	

}
