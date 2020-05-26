/*
 * @author: Elysé Ntigirishari           
 */
public class ChequingAccount extends BankAccount {
	/** The current ChequingAccount fee **/
	private int fee;

	/**
	 * initialize ChequingAccount objects
	 * 
	 * @param balance sets actual account balance
	 * @param fee     which is applied to chequingAccount
	 * 
	 **/
	public ChequingAccount(double balance, int fee) {
		super(balance);
		this.fee = fee;
	}

	/**
	 * toString displays ChequingAccount and BankAccount information
	 * 
	 * @return BankAccount information
	 */
	public String toString() {
		return super.toString() + " Account fee: $" + Integer.toString(this.fee);
	}

	/**
	 * calculateAndUpdateBalance actualizes the ChequingAccount balance
	 * 
	 * @param amount which updates the balance
	 * @return balance that is updated balance
	 */

	@Override
	public double calculateAndUpdateBalance(double interestRate) {
		//super.balance = amount;
		interestRate = super.monthlyInterestRate;
		double newBalance = super.balance - fee ;
		super.balance = newBalance;
		//super.balance = newBalance + newBalance* interestRate;
		return super.getBalance();

	}

}