// This program has variables of several of the integer types.

public class IntegerVariables {
	public static void main (String[] args) {
		int checking; // Declare an int variable named checking.
		byte miles;
		short minutes;
		long days;

		checking = -20;
		miles = 105;
		minutes = 120;
		days = 189000;

		System.out.println("We have made a journey " + miles + " miles.");
		System.out.println("It took us " + minutes + " minutes");
		System.out.println("Our account balance is $" + checking);
		System.out.println("About " + days + " days ago Columbus " + "stood on this spot.");
	}
}

