import java.io.*;
import java.util.Scanner;

public class FileReadDemo {

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the filename: ");
        String fileName = keyboard.nextLine();

        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {
            String friendName = inputFile.nextLine();
            System.out.println(friendName);
        }

        inputFile.close();
        keyboard.close();
    }
}
