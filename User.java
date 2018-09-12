package myFirstProject;

public class User 
{
	private String userName;
	private String email; 
	private String firstname;
	private String lastname;
	
	// Method signature consists of....
	// Accessor - public, private, or protected.
	// Return type - Any type or void for nothing. 
	// Method name - make it good so people know what the method does.
	// Argument list - parameters passed to the method.
	public String GetUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	
}