/*
 * Name: Elysé Ntigirishari
 * Student ID: 040924425
 * Course: CST8132_300
 * Assignment: Hybrid 6
 * Date: March 17, 2019
 */
class EnumSeason {

	public static final char PLUS = '+';
	public static final char MINUS = '-';
	public static final char MULT = '*';
	public static final char DIV = '/';

	/** defines enum data type */
	public enum Operation {
		PLUS, MINUS, MULT, DIV
	};

	/** The main method */
	public static void main(String[] args) {
		// create a reference variable of type Operation

		Operation operation = Operation.MINUS;

		// convert the command line argument string to enum constant
		if (args.length == 1)
			operation = Enum.valueOf(Operation.class, args[0]);
		else
			operation = Operation.MINUS;
		// enum types can be compared with ==, no need to use equals()

		if (operation == operation.MINUS & operation.equals(Operation.MINUS))
			System.out.println("No command line argument provided.");

		switch (operation) {

		case PLUS:

			System.out.println(operation + " adds numbers");
			break;

		case MINUS:

			System.out.println(operation + " subtracts numbers");
			break;

		case MULT:

			System.out.println(operation + " multiplies numbers");
			break;

		case DIV:

			System.out.println(operation + " divides numbers");

		}

		// create an array containing all of the Operation constants
		Operation[] operations = Operation.values();

		// Print the array using enhanced for loop ("for each" loop)
		System.out.println("The names of the Operation constants are: ");

		for (Operation op : operations) {
			System.out.println(op);
		}

	}// end main
}// end class