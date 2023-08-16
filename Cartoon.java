package fr.jseb.programme.library;

public class Cartoon {
	// Member variables -  -- -- - - 
			private String cartoonTitle;
			private String cartoonAuthor;
			private String cartoonCollection;
			private Boolean cartoonAvailable = true;
			
				
		// GETTERS end SETTERS - - - -- - 
			public String getCartoonTitle() {
				return cartoonTitle;
			}
			public void setCartoonTitle(String pcartoonTitle) {
				this.cartoonTitle = pcartoonTitle;
			}
			public String getCartoonAuthor() {
				return cartoonAuthor;
			}
			public void setCartoonAuthor(String pcartoonAuthor) {
				this.cartoonAuthor = pcartoonAuthor;
			}
			public String getCartoonCollection() {
				return cartoonCollection;
			}
			public void setCartoonCollection(String pcartoonCollection) {
				this.cartoonCollection = pcartoonCollection;
			}
			public Boolean getCartoonAvailable() {
				return cartoonAvailable;
			}
			public void setCartoonAvailable(Boolean pcartoonAvailable) {
				this.cartoonAvailable = pcartoonAvailable;
			}
			//= = = = = == = = = = 
			
			// Public Constructors - - - -- 
			public Cartoon(String pcartoontitle,String pcartoonAuthor, String pcartoonCollection, Boolean pcartoonAvailable) {
				this.setCartoonTitle(pcartoontitle);
				this.setCartoonAuthor(pcartoonAuthor);
				this.setCartoonCollection(pcartoonCollection);
				this.setCartoonAvailable(pcartoonAvailable);
			}
			// = = = = = = = = =
			
			// Methods - - - - - -
			 @Override
		        public String toString() {
		            return "Titre: " + cartoonTitle + ", Auteur: " + cartoonAuthor + ", Numéro: " + cartoonCollection + ", Disponible: " + cartoonAvailable;
		        }
}
			