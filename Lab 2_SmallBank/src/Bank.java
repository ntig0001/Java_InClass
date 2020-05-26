/* Name: Elysé Ntigirishari         
 * Student ID: 040924425          
 * Course & Section: CST8132 301   
 * Assignment: Lab 3  
 * Date: Feb 5, 2019     
 */
import java.util.Scanner; //import Scanner class
import java.text.DecimalFormat; //import the Decimal Format class

//bank class
public class Bank {

	// bank field members
	@SuppressWarnings("unused")
	private String bankName;
	private Account[] accounts;
	private int numOfAccounts;
	private static Scanner input;

	// default constructor for a bank object
	public Bank() {

		input = new Scanner(System.in);
		System.out.print("Enter Bank Name: "); // allow user for a bank name input
		bankName = input.next();

		System.out.print("Enter the number of Bank Accounts: "); // allow user input for number of bank accounts
		this.numOfAccounts = input.nextInt();

		this.accounts = new Account[numOfAccounts]; // array of accounts

		for (int i = 0; i < numOfAccounts; i++) { // allow entries from the various account holders

			System.out.printf("\nEnter client %d's first name: ", i + 1); // client's first name
			String firstName = input.next();

			System.out.printf("Enter client %d's last name: ", i + 1); // client's last name
			String lastName = input.next();

			System.out.printf("Enter client %d's phone number: ", i + 1); // client's phone number
			long phoneNumber = input.nextLong();

			System.out.printf("Enter client %d's email address: ", i + 1); // client's email address
			String email = input.next();
			while (email.contains("@") == false) {
				
				// display error message for an invalid entry
				System.out.print("\nYour email is incorrect...Please, try again: "); 
																						
				email = input.next();
			}

			 // create a Client object for user opening balance input
			Client myClient = new Client(firstName, lastName, phoneNumber, email);
																					
			System.out.print("\nPlease enter the opening balance: ");
			double initialBalance = input.nextDouble(); // allow entry of the client's opening balance

			this.accounts[i] = new Account(myClient, initialBalance);

		}
	}

	// print out the different accounts
	public void printAccounts() {

		DecimalFormat df = new DecimalFormat("#,###");

		for (int i = 0; i < this.numOfAccounts; i++) { // display account details
			System.out.print("\n\nAccount number: " + accounts[i].getAccountNum() 
					+ "\nClient name: " + accounts[i].getName() 
					+ "\nEmail address: " + accounts[i].getClient().getEmail()
					+ "\nPhone number: " + accounts[i].getClient().getPhoneNum() 
					+ "\nAccount balance: "+ df.format(accounts[i].getBalance()));
					
		}
		System.out.println();
	}

	public static void main(String[] args) { // bank main method

		DecimalFormat df = new DecimalFormat("#,###"); // DecimalFormat to format the client's balance
		Bank myBank = new Bank(); // declare and instantiate a new Bank object.

		boolean controlLoop = true; // boolean variable process user options related to their account

		while (controlLoop) {

			System.out.print("\nAccount options:\n" // display the options
					+ "\nP or p: Print your account details: " + "\nW or w: Withdraw amount from your current balance: "
					+ "\nD or d: Deposit amount to your account: " + "\nQ or q: Quit program: \n"
					+ "\nPlease input your choice: ");

			String input1 = Bank.input.next().toLowerCase(); // accept any entered letter regardless of its case
			controlLoop = !(input1.equals("q")); // define when ControlLoop is true

			switch (input1) {

			case "p":
				myBank.printAccounts(); //print account details
				break;

			case "w":
				System.out.print("Please enter the index of the account: "); // ask the user for index
				int index1 = Bank.input.nextInt();

				System.out.print("Please enter the amount to withdraw: "); // ask the user for his withdrawal
				double withdrawal = Bank.input.nextDouble();

				Account account1 = myBank.accounts[index1]; // connect user index input with their account number

				boolean hasSufficientBalance = account1.withdraw(withdrawal); // balance check
				if (!(hasSufficientBalance)) {
					
					// error message for insufficient balance
					System.out.print("\nInsufficient funds! Balance is: $" + df.format(account1.getBalance())); 
				}
				break;

			case "d":
				System.out.print("Please enter the index of the account: ");  //enter account to operate on 
				int index2 = Bank.input.nextInt();

				System.out.print("Please enter the amount to deposit: "); //input amount to deposit
				double deposit = Bank.input.nextDouble();
				Account account2 = myBank.accounts[index2]; // connect user index input with their account number
				account2.deposit(deposit);
				break;

			case "q":
				controlLoop = input1 == "q"; //quit the program
				input.close();
				break;

			default:
				break; 
			}

		}

	}

}
//end of program