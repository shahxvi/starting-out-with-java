import java.io.*;
import java.util.Scanner;

public class FileWriteDemo {

    public static void main(String[] args) throws IOException {
        String fileName;
        String friendName;
        int numFriends;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many friends do you have? ");
        numFriends = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter the filename: ");
        fileName = keyboard.nextLine();

        // Create outputFile reference variable to PrintWriter class
        // and create a new object named "fileName"
        PrintWriter outputFile = new PrintWriter(fileName);

        for (int i = 0; i < numFriends; i++) {
            System.out.print("Enter the name of friend #" + (i + 1) + " : ");
            friendName = keyboard.nextLine();
            outputFile.println(friendName);
        }

        keyboard.close();
        outputFile.close();
        System.out.println("Data written to " + fileName);
    }
}
