import java.util.Scanner;
import java.io.*;

public class MyName {
	public static void main(String[] args) throws IOException {
		String name;
		Scanner keyboard = new Scanner(System.in);
		File file = new File("MyName.txt");
		PrintWriter outputFile = new PrintWriter(file);

		System.out.print("Please enter your first name: ");
		name = keyboard.nextLine();

		outputFile.println(name);

		keyboard.close();
		outputFile.close();
		
		System.out.println("First name written to MyName.txt");
	}
}

