package fr.jseb.programme.library;

public class Customer {
	
	//Members variables -- - - - -
		private String customerName;
		private String customerFname;
		private String customerMail;
	//= = = = = =
		
	//GETTERS and SETTERS - - - -
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerFname() {
		return customerFname;
	}
	public void setCustomerFname(String customerFname) {
		this.customerFname = customerFname;
	}
	public String getCustomerMail() {
		return customerMail;
	}
	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}
	//= = = = = 
	
	//Constructor - - - - - -
	public Customer(String customerName, String customerFname, String customerMail) {
		this.customerName = customerName;
		this.customerFname = customerFname;
		this.customerMail = customerMail;
	//= = = = = = 
		
		
	}
	
	
	
	

}
