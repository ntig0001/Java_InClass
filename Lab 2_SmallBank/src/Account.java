/* Name: Elysé Ntigirishari         
 * Student ID: 040924425          
 * Course & Section: CST8132 301   
 * Assignment: Lab 3  
 * Date: Feb 5, 2019     
 */
import java.util.Random;

//program for a bank Account information 
public class Account {

	// account attributes
	private long accountNum;
	private Client client;
	private double balance;

	// account object blueprint
	public Account(Client client, double balance) {
		Random randomValue = new Random(); // random object

		this.client = client;
		this.balance = balance;
		this.accountNum = Math.abs(randomValue.nextLong());
	}

	// deposit the client's amount
	public void deposit(double amt) {
		balance += amt; // increment the balance with the new deposited amount
	}

	// get amount upon availability
	public boolean withdraw(double amt) {
		if (amt <= balance) { // check if the amount to withdraw is available
			balance -= amt; // decrease the balance with the amount
			return true;
		}
		return false;
	}

	// return the client Account Number
	public long getAccountNum() {
		return this.accountNum; // return the client's account number
	}

	// return the client information
	public Client getClient() {
		return this.client; // return the client object
	}

	// show the client their balance
	public double getBalance() {
		return this.balance; // return the balance
	}

	// return the client name
	public String getName() {
		return this.client.getName(); // call the client name using the client method
	}

}
