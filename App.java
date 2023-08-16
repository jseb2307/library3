package fr.jseb.programme.library;

import java.util.Random;
import java.util.Scanner;
public class App {


	public static void main(String[] args) {

		App app = new App();
		app.start();
	}

	public void start() {
		
		Boolean pavailable = true;
		String title;
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		Library library = new Library();
		
		for(int i =0; i<5; i++) {   // mettre 5 livres dans la bibliothèque
		
			// saisiE utilisateur
			System.out.println("Veuillez entrer le titre du livre " + (i +1));
			String pbookTitle =input.nextLine();
			
			
			System.out.println("Veuillez entrer l'auteur ");
			String pbookAuthor = input.nextLine();
			
			
			int pisbnNumber = random.nextInt(100); // random isbn number
			
			
			// creation d'un obj book à partir de la sasie	
			Book book = new Book(pbookTitle,pbookAuthor,pisbnNumber,pavailable);
			//System.out.println("Book créé :");
	       // System.out.println("Titre: " + book.getBookTitle());
	       // System.out.println("Auteur: " + book.getBookAuthor());
	       // System.out.println("Numéro: " + book.getIsbnNumber());
	       // System.out.println("Numéro: " + book.getAvailable());
			
			// j'ajoute le livre dans la liste de la librairie
	        
	       
	        library.addBook(book);
	          //afficher la liste des livres
	        
		}
		library.displayBooks();
		System.out.println(" quel titre recherchez vous ?");
		title = input.nextLine();
		if(library.contains(book)) {
		  //  System.out.println("Objet trouvé!");
		input.close();
		
	}	
}
}