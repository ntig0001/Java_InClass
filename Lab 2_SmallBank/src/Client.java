/* Name: Elysé Ntigirishari         
 * Student ID: 040924425          
 * Course & Section: CST8132 301   
 * Assignment: Lab 3  
 * Date: Feb 5, 2019     
 */
//program for attributes and functions on a bank account
public class Client {

	// client attributes
	private String firstName;
	private String lastName;
	private long phoneNum;
	private String email;

	// blueprint for a client object
	public Client(String firstName, String lastName, long phoneNum, String email) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.email = email;
	}

	// return the client's full name
	public String getName() {
		return firstName + " " + lastName;
	}

	// return the client's phone number
	public long getPhoneNum() {
		return phoneNum;
	}

	// return the client's email
	public String getEmail() {

		return email;
	}

}
