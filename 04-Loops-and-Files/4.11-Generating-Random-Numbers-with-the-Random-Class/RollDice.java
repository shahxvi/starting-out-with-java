import java.util.Random;
import java.util.Scanner;

public class RollDice {
	public static void main(String[] args) {
		int die1;
		int die2;
		String stringInput = "Y";

		Random randomNumber = new Random();
		Scanner keyboard = new Scanner(System.in);

		while (stringInput.equalsIgnoreCase("Y")) {
			System.out.println("Rolling the dice..");
			die1 = randomNumber.nextInt(6) + 1;
			die2 = randomNumber.nextInt(6) + 1;
			System.out.printf("%-10s%-10s\n", "Dice 1:", "Dice 2:");
			System.out.printf("%-10d%-10d\n", die1, die2);

			System.out.print("Roll them again? (Y/N): ");
			stringInput = keyboard.nextLine();
			System.out.println();
		}

		keyboard.close();
	}
}

