import javax.swing.JOptionPane;

public class CookieCalories {
	public static void main(String[] args) {
		String inputString;
		int cookies;

		// 10 servings = 300 calories
		final int serving = 10;
		final double calories = 300;

		inputString = JOptionPane.showInputDialog("How many cookies did you ate?");

		cookies = Integer.parseInt(inputString);

		double totalCalories = cookies * (calories / serving);

		JOptionPane.showMessageDialog(null, "You have eaten " + totalCalories + " calories");

		System.exit(0);
	}
}

