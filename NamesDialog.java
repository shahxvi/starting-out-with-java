import javax.swing.JOptionPane;

/**
 * This program demonstrates using dialogs with JOptionPane.
 */

public class NamesDialog {
	public static void main(String[] args) {
		String firstName, lastName;

		// Get first name
		firstName = JOptionPane.showInputDialog("What is your first name?");

		// Get last name
		lastName = JOptionPane.showInputDialog("What is your last name?");

		// Displays first & last name
		JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName);

		System.exit(0); // Necessary when using JOptionPane for the dialog box to close
	}
}

