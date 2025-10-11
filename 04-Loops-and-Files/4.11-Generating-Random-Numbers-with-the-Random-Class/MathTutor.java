import java.util.Random;
import java.util.Scanner;

public class MathTutor {
	public static void main(String[] args) {
		int num1;
		int num2;
		int sum;
		int intInput;

		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();
		
		System.out.println("What is the answer to the following problem?");
		
		num1 = randomNumber.nextInt(100);
		num2 = randomNumber.nextInt(100);
		sum = num1 + num2;

		System.out.printf("%d + %d = ", num1, num2);
		intInput = keyboard.nextInt();

		System.out.println(intInput == sum ? "Correct!": "Sorry, wrong answer. The correct answer is " + sum);

		keyboard.close();
	}
}

