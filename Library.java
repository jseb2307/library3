package fr.jseb.programme.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	// Attributs - - - - 
	private List<Book> books;
	//= = = = = 
	
	//GETTEURS and SETTERS
	//= = = = = 
	
	//Constructors - - - 
	 public Library() {
	    books = new ArrayList<>();
	    }
	//méthodes - - - - -
	 
	 //add book to the library- - - - --
	  public void addBook(Book book) {
	        books.add(book);
	    }
	  //= = = = = =
	  
	  // afficher la liste des livres
	public void displayBooks() {
		 if (books.isEmpty()) {
	            System.out.println("La bibliothèque est vide.");
	        } else {
	            System.out.println("Il y a " + books.size() + " Livres dans la bibliothèque :");
	            for (Book book : books) {
	                System.out.println(book.toString());
	            }	}
	
	}
		
   
	}
