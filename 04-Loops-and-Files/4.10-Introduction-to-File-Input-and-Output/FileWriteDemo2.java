import java.util.Scanner;
import java.io.*;

public class FileWriteDemo2 {
	public static void main(String[] args) throws IOException {
		int numFriends = 0;
		String fileName;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("How many friends do you have?: ");
		numFriends = keyboard.nextInt();

		keyboard.nextLine();

		System.out.print("Enter file name: ");
		fileName = keyboard.nextLine();

		File file = new File(fileName);

		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		
		PrintWriter outputFile = new PrintWriter(file);

		for (int i = 0; i < numFriends; i++) {
			System.out.print("Enter friend #" + (i+1) + " name: ");
			outputFile.println(keyboard.nextLine());
		}

		outputFile.close();
		keyboard.close();

		System.out.println("File written to " + fileName);
	}
}

