import java.util.Scanner;
import java.io.*;

/**
 * This program reads a series of numbers from a file and accumulates their sum
 */

public class FileSum {
	public static void main(String[] args) throws IOException {
		double sum = 0.0; // Accumulator

		File file = new File("Numbers.txt"); // Create a new .txt file with a reference variable named "file"
		Scanner inputFile = new Scanner(file); // Create a new scanner for "file"

		while (inputFile.hasNext()) {
			double number = inputFile.nextDouble();
			sum += number;
		}

		inputFile.close();

		System.out.println("The sum of the numbers in Numbers.text is: " + sum);
	}
}

