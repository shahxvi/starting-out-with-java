import java.util.Scanner;

public class StringAnalyzer {
	public static void main(String[] args) {
		String input;
		char[] array;
		int letters = 0;
		int digits = 0;
		int whitespaces = 0;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a string: ");
		input = keyboard.nextLine();

		array = input.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if (Character.isLetter(array[i]))
				letters++;
			else if (Character.isDigit(array[i]))
				digits++;
			else if (Character.isWhitespace(array[i]))
				whitespaces++;
		}

		System.out.println("That string contains " + letters + " lettes, " + digits + " digits, and " + whitespaces + " whitespaces characters.");

		keyboard.close();
	}
}

