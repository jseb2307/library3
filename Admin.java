package fr.jseb.programme.library;

public class Admin {
	
	// Members variables - - - - - 
	private String adminName;
	private String adminFname;
	private String adminNumber;
	//= = = = = = = 
	
	//GETTERS and SETTERS - - - -
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminFname() {
		return adminFname;
	}
	public void setAdminFname(String adminFname) {
		this.adminFname = adminFname;
	}
	public String getAdminNumber() {
		return adminNumber;
	}
	public void setAdminNumber(String adminNumber) {
		this.adminNumber = adminNumber;
	}
	//= = = = = = = 
	
	// Constructor - - - - -
	public Admin(String adminName, String adminFname, String adminNumber) {
		this.adminName = adminName;
		this.adminFname = adminFname;
		this.adminNumber = adminNumber;
	}
	//= = = = = = = 
	
	
	

}
