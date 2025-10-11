import java.util.Scanner;

public class PersonSearch {
	public static void main(String[] args) {
		String lookUp;

		String[] people = { "Cutshaw, Will", "Davis, Jenny", "Russert, Phill", "Russell, Cindy", "Setzer, Charles", "Smarthers, Holly", "Smith, Chris", "Smith, Brad", "Williams, Jean" };

		Scanner keyboard = new Scanner(System.in);

		while (true) {
			System.out.print("Enter the first few characters of the last name to look up (CTRL-C to exit): " );
			lookUp = keyboard.nextLine();

			System.out.println("Here are the names that matches");
			for (String person : people) {
				if (person.startsWith(lookUp))
					System.out.println(person);
			}
		}
	}
}

