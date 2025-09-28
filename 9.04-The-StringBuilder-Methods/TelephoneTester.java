/* This program demonstrates the Telepone class's static methods */

import java.util.Scanner;

public class TelephoneTester {
        public static void main(String[] args) {
                String phoneNumber;
                Scanner keyboard = new Scanner(System.in);

                System.out.print("Enter an unformatted telephone number: ");
                phoneNumber = keyboard.nextLine();

                System.out.println("Formatted: " + Telephone.format(phoneNumber));

                System.out.print("Enter a telephone number formatted as (XXX)XXX-XXXX: ");
                phoneNumber = keyboard.nextLine();

                System.out.println("Unformatted: " + Telephone.unformat(phoneNumber));
        }
}

