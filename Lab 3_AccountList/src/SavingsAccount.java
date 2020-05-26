/*
 * @author: Elysé Ntigirishari           
 */

import java.text.DecimalFormat;

public class SavingsAccount extends BankAccount {

	private double interestRate;

	/** SavingsAccount yearly interest rate */

	/**
	 * initialize SavingsAccount objects
	 * 
	 * @param balance      sets actual account balance
	 * @param interestRate - sets actual SavingsAccount interest rate
	 */
	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	/**
	 * toString displays SavingsAccount and BankAccount information
	 * 
	 * @return BankAccount information
	 */
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.##");
		return super.toString() + " Interest Rate: " + df.format(this.interestRate) + "%";
	}

	/**
	 * calculateAndUpdateBalance actualizes the SavingsAccount balance
	 * 
	 * @param amount which updates the balance
	 * @return balance that is updated balance
	 */

	@Override
	public double calculateAndUpdateBalance(double interestRate) {

		interestRate=super.monthlyInterestRate;
		super.balance= super.balance + (super.balance * interestRate);
		return super.getBalance();
	}
}