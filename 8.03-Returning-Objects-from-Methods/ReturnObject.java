import javax.swing.JOptionPane;

public class ReturnObject {
	public static void main(String[] args) {
		BankAccount account;

		account = getAccount();

		JOptionPane.showMessageDialog(null, "The amount has a balance of RM" + account.getBalance());

		System.exit(0);
	}

	public static BankAccount getAccount() {
		String input;
		double balance;

		input = JOptionPane.showInputDialog("Enter the account balance");
		balance = Double.parseDouble(input);

		return new BankAccount(balance);
	}
}

