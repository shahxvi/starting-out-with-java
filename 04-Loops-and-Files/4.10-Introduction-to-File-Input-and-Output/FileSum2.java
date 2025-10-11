import java.util.Scanner;
import java.io.*;

public class FileSum2 {
	public static void main(String[] args) throws IOException {

		File file = new File("Numbers.txt");

		if (!file.exists()) {
			System.out.println("The file Numbers.txt is not found.");
			System.exit(0);
		}

		Scanner inputFile = new Scanner(file);

		double sum = 0.0;

		while (inputFile.hasNext())
			sum += inputFile.nextDouble();

		inputFile.close();

		System.out.println("The sum of the numbers in Numbers.txt is " + sum);
	}
}

