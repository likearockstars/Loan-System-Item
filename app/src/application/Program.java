package application;

import java.time.LocalDate;
import java.time.LocalDateTime;

import model.Author;
import model.Book;
import model.Library;
import model.LoanItem;
import model.User;

public class Program {

	public static void main(String[] args) {
		
		
		User user = new User("Davi","Nunes",LocalDate.now(),"davijnunesdeveloper@gmail.com",1);
		Author author = new Author("Fernando","Henrique",LocalDate.now(),"fernandohenrique@gmail","ferplay",2);
		
		Book book = new Book(1,"Linguagem Java","Livro de programação Java",900.00,LocalDate.now(),author,"Tecnológia","Novatec","20202020",300);
		Book book2 = new Book(2,"Linagugem Python","Livro de programação Python",1000.00,LocalDate.now(),author,"ss","ss","ss",30);
		Library lib = new Library();
		

		lib.addItem(book2);
		lib.addItem(book);
		lib.loanItem(book2, user, LocalDateTime.now());
		lib.loanItem(book, user, LocalDateTime.now());
		lib.getInformation(user);
		lib.removeItem(book2);
		System.out.println();
		lib.getInformation(user);
		
	
		
	}
}
