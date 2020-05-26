/*
 * @author: Elysé Ntigirishari           
 */

import java.util.Random;

public class BankAccountTest {
	/** list containing all bank accounts **/
	private BankAccount[] accounts;
	/** declared random object **/
	private Random random;
	/** default random balance*/
	private double defaultRandomBalance;
	/** default random fee*/
	private int defaultRandomFee;
	/** default random interest rate*/
	private double defaultInterestRate;


	/**
	 * initialize, declare and instantiate 5 BankAccount objects: 2 SavingsAccount
	 * and 3 ChequingAccount
	 * 
	 **/
	public BankAccountTest() {
		/**
		 * tracker keeps track of the array index and arrayLimit keeps the range of
		 * every array
		 **/
		int tracker = 0;
		int arrayLimit = 5;
		this.accounts = new BankAccount[arrayLimit];
		this.random = new Random();
		defaultRandomBalance = 20 + 80 * this.random.nextDouble();
		defaultRandomFee = (int)(1 + 4 * this.random.nextDouble());
		defaultInterestRate = .02 + .08 * this.random.nextDouble();

		/** Savings accounts */

		/** define the number of savings accounts needed */
		int sizeS = 2;

		for (int i = 0; i < sizeS; i++) {
			this.accounts[tracker] = new SavingsAccount(defaultRandomBalance, defaultInterestRate);
			tracker++;
		}

		/** Chequing accounts */

		/** define the number of chequing accounts needed */
		int sizeC = 3;


		for (int i = 0; i < sizeC; i++) {
			this.accounts[tracker] = new ChequingAccount(defaultRandomBalance, defaultRandomFee);
			tracker++;
		}

	}

	/**
	 * This method monthlyProcess that takes an array of bank accounts as a
	 * parameter and performs the monthly balance update for each account by
	 * computing it.
	 * 
	 * @param [accounts] - array of bank account to be updated
	 */
	public void monthlyProccess(BankAccount accounts[]) {
		for (BankAccount account : accounts) {
			account.calculateAndUpdateBalance(account.monthlyInterestRate);
		}
	}

	/*
	 * display displays to the console each account for any BankAccount array
	 * argument
	 */
	public void display() {
		for (BankAccount account : this.accounts) {
			System.out.println(account.toString());
		}

	}

	/** main */

	public static void main(String args[]) {

		BankAccountTest bank = new BankAccountTest(); /** BankAccountTest instance **/

		/** simulate an entire year of processes and displays) */
		for (int i = 0; i < 12; i++) {
			bank.monthlyProccess(bank.accounts);
			bank.display();
			System.out.println();
		}
	}
}