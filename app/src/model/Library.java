package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exception.ItemNotFoundException;
import exception.LoanException;

public class Library implements LoanService,LoanInformationService{

	List<Item> items;
	private static Integer borrowedItemCount = 0;
	
	public Library() {
		
		// Instância uma lista de itens.
		items = new ArrayList<Item>();
	}

	/**
	 *@param user
	 */
	@Override
	public void getInformation(User user) {
	    // Cria um HashMap para mapear IDs de itens para itens
	    Map<Integer, Item> itemMap = new HashMap<>();
	    // Percorre todos os itens da biblioteca
	    for (Item currentItem : items) {
	    	// Adiciona o identificador do item como chave é o item como valor.
	        itemMap.put(currentItem.getIdItem(), currentItem);
	    }
	    
	    // Percorre os registros de empréstimos do usuário
	    for (LoanItem currentLoanItem : user.getLoans()) {
	        // Obtém o item através do identificador integer.
	        Item item = itemMap.get(currentLoanItem.getIdItem());
	        // Se o item foi encontrado, imprime suas informações
	        if (item != null) {
	            System.out.println(item.toString());
	        }
	    }
	}

	/**
	 *@param item
	 *@param user
	 *@param returnDate
	 *@throws LoanException
	 *@throws ItemNotFoundException
	 */
	@Override
	public void loanItem(Item item, User user, LocalDateTime returnDate) throws LoanException, ItemNotFoundException{
		
		// Inicializa a variável de empréstimo
		LoanItem loan = null;
		
		// Caso o item estiver disponivel iremos prosseguir
	    if (!item.getIsBorrowed()) {
	    // Se a lista conter o item desejado pelo usuário iremos prosseguir
	        if (items.contains(item)) {
	        	// Instânciamos o empréstimo
	            loan = new LoanItem(user.getIdUser(),item.getIdItem(),returnDate);
	            // Adiciono a lista de registro de empréstimo do usuário
	            user.getLoans().add(loan);
	            // Dizemos que o item não está mais disponivel
	            item.setIsBorrowed(true);
	            // Contabilizamos os emprestimos
	            borrowedItemCount++;
	            return; // Adicionado para sair do método após encontrar o item
	            
	        } else {
	            throw new ItemNotFoundException("O item não está armazenado na bíblioteca!");
	        }
	    } else {
	    	
	        throw new LoanException("Este item já está empréstado para algum outro usuário!");
	    }
	}
		
	
	/**
 	 *@param item
	 *@param user
	 *
	 */
	@Override
	public void returnItem(Item item,User user) {
		// Iremos percorrer a lista de empréstimos associados ao usuário
		for(LoanItem currentLoanItem: user.getLoans()) {
			
			// Iremos verificar se o item que pretendemos remover está associado ao registro de empréstimos do usuário
			if(item.getIdItem().equals(currentLoanItem.getIdItem())) {
				// Iremos trocar o status para disponivel do item
				item.setIsBorrowed(false);
				// Iremos remover da lista de registros de empréstismo do usuário
				user.getLoans().remove(currentLoanItem);
				// Iremos delvover o item a bíblioteca.
				items.add(item);
				
			}
		}
		
		
	}
	
	
	/**
	 * Adiciona um item a lista de itens da bíblioteca.
	 * @param item
	 */
	public void addItem(Item item) {
		items.add(item);
	}
	
	/**
	 * Remove um item da lista de bíblioteca.
	 * @param item
	 */
	public void removeItem(Item item) {
		items.remove(item);
	}
	
}
