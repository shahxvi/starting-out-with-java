import java.util.Scanner;
import java.io.*;

public class FileWriteDemo3 {
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		String fileName;
		String stringInput;
		char charInput = 'N';
		boolean override;

		int numFriends;

		System.out.print("Please enter the file name you want to write to: ");
		fileName = keyboard.nextLine();

		File file = new File(fileName);

		System.out.print("How many friends do you have?: ");
		numFriends = keyboard.nextInt();

		keyboard.nextLine();

		if (file.exists()) {
			System.out.println("File already exists.");
			System.out.print("Do you want to override it? (Y/N): ");
			stringInput = keyboard.nextLine().toUpperCase();
			charInput = stringInput.charAt(0);
		}

		override = (charInput == 'Y') ? true: false;

		if (!override) {
			System.out.println("Exiting program");
			keyboard.close();
			System.exit(0);
		}
		
		PrintWriter outputFile = new PrintWriter(file);

		for (int i = 0; i < numFriends; i++) {
			System.out.print("Enter friend #" + (i+1) + " name: ");
			outputFile.println(keyboard.nextLine());
		}

		System.out.println("File written to " + fileName);

		keyboard.close();
		outputFile.close();
		System.exit(0);
	}
}

