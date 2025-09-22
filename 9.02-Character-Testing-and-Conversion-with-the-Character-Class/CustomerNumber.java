import javax.swing.JOptionPane;

public class CustomerNumber {
	public static void main(String[] args) {
		String input;

		input = JOptionPane.showInputDialog("Enter a customer number in the form LLLNNNN\n" +
						    "(LLL = letters and NNNN = numbers)");

		if (isValid(input)) {
			JOptionPane.showMessageDialog(null, "That's a valid customer number.");
		} else {
			JOptionPane.showMessageDialog(null, "That is not the proper format of a customer number.\n" +
							    "Here is an example: ABC1234");
		}

		System.exit(0);
	}

	private static boolean isValid(String customerNumber) {
		int characterIndex = 0;

		// Test the length
		if (customerNumber.length() != 7)
			return false;

		// Test the first three characters for letters
		while (characterIndex < 3) {
			if (!Character.isLetter(customerNumber.charAt(characterIndex)))
				return false;
			characterIndex++;
		}

		// Test the last four characters for numbers
		while (characterIndex < 7) {
			if (!Character.isDigit(customerNumber.charAt(characterIndex)))
				return false;
			characterIndex++;
		}

		return true;
	}
}

