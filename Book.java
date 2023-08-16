package fr.jseb.programme.library;

public class Book {
	
	// Member variables -  -- -- - - 
		private String bookTitle;
		private String bookAuthor;
		private int isbnNumber;
		private Boolean available = true;
		
			
	// GETTERS end SETTERS - - - -- - 
		public String getBookTitle() {
			return bookTitle;
		}
		public void setBookTitle(String pbookTitle) {
			this.bookTitle = pbookTitle;
		}
		public String getBookAuthor() {
			return bookAuthor;
		}
		public void setBookAuthor(String pbookAuthor) {
			this.bookAuthor = pbookAuthor;
		}
		public int getIsbnNumber() {
			return isbnNumber;
		}
		public void setIsbnNumber(int pisbnNumber) {
			this.isbnNumber = pisbnNumber;
		}
		public Boolean getAvailable() {
			return available;
		}
		public void setAvailable(Boolean pavailable) {
			this.available = pavailable;
		}
		//= = = = = == = = = = 
		
		// Public Constructors - - - -- 
		public Book(String pbooktitle,String pbookAuthor, int pisbnNumber, Boolean pavailable) {
			this.setBookTitle(pbooktitle);
			this.setBookAuthor(pbookAuthor);
			this.setIsbnNumber(pisbnNumber);
			this.setAvailable(pavailable);
		}
		// = = = = = = = = =
		
		// Methods - - - - - -
		 @Override
	        public String toString() {
	            return "Titre: " + bookTitle + ", Auteur: " + bookAuthor + ", Numéro: " + isbnNumber + ", Disponible: " + available;
	        }
		
		// Make a book- - - - - -
		 //= = = = =
		 
		 //Borrow a book - - - - 
		 //= = = = =
		 
		 
			
		}	
		
		
	
