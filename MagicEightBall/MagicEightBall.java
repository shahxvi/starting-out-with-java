import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;

/* TLDR:
 * Create keyboard scanner, file and inputFile scnaner
 * Create ArrayList of ballResponses with capacity of numOfResponses
 * Load the ArrayList with response strings from 8_ball_responses.txt
 * Generate a random int of numOfResponses
 * Use the random int to get one of the responses from the ballResponses ArrayList
 * Prints the response
 * Loops until the user inputs other than "No"
 */

public class MagicEightBall {
    public static void main(String[] args) throws IOException {

    Scanner keyboard = new Scanner(System.in);
    String filename = "8_ball_responses.txt";

    File file = new File(filename);
    Scanner inputFile = new Scanner(file);

    int numOfResponses = 12; // Needs to be updated every time the 8_ball_responses change
                             // TODO: determine the number of responses based on the file instead

    ArrayList<String> ballResponses = new ArrayList<>(numOfResponses); // ballResponses with the capacity of numOfResponses

    // Loads the responses from the text file to the ArrayList
    while (inputFile.hasNext()) {
        for (int i = 0; i < numOfResponses; i++)
            ballResponses.add(inputFile.nextLine());
    }

    // Initialize needed variable for the program
    int responseNum;
    String keyboardInput = "Yes";
    Random randomNumber = new Random();

    // Exit the program when the user says other than "No"
    while (!keyboardInput.equalsIgnoreCase("No")) {

        // Clears Screen or Terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // System.out.println(ballResponses); // For Debugging Purporses

        // Generate new int number when it loops
        responseNum = randomNumber.nextInt(numOfResponses);

        // Uses the generated int to randomly select the response
        String response = ballResponses.get(responseNum);

        System.out.print("Ask the Magic 8 Ball!: ");
        keyboardInput = keyboard.nextLine(); // Doesn't matter what the user type lol, actually we can put easter eggs here
        System.out.println(response);

        System.out.print("Ask again? (Yes/No): ");
        keyboardInput = keyboard.nextLine();
        System.out.println(); // Blank New Line
    }

    inputFile.close();
    keyboard.close();

    }
}

