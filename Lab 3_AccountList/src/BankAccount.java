/*
 * @author: Elysé Ntigirishari           
 */
import java.text.DecimalFormat;
import java.util.Random;

public abstract class BankAccount {

	//account fields
	protected double balance;
	private long accountNo;
	protected double monthlyInterestRate;
	
	/**
	 * BankAccount initial constructor
	 * 
	 * @param balance sets actual account balance
	 * 
	 **/

	public BankAccount(double balance) {
		Random rand = new Random(); //** Random object to always have a positive account *//*
		this.accountNo = Math.abs(rand.nextLong());
		this.balance = balance;
		double defaultInterestRate = .02 + .08 * rand.nextDouble();
		monthlyInterestRate = defaultInterestRate;

	}

	/**
	 * getBalance retrieves the actual balance of BankAccount object.
	 * 
	 * @return balance which is actual balance of account
	 * 
	 **/
	public double getBalance() {
		return this.balance;
	}

	/**
	 * toString displays bank account information
	 * 
	 * @return bankAccount which is bankAccount information (accountNo, balance)
	 * 
	 **/
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.##");
		return "Account Number: " + this.accountNo + " Account Balance: $" + df.format(this.balance);

	}

	/**
	 * abstract calculateAndUpdateBalance computes and returns the actual balance
	 * 
	 * @param amount with which to update the balance
	 * 
	 **/
	public abstract double calculateAndUpdateBalance(double interestRate);

}