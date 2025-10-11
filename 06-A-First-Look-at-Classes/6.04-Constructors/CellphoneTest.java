import java.util.Scanner;

public class CellphoneTest {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Cellphone cellphone = new Cellphone("None", "None", 0.0);

		System.out.print("Enter the manufacturer: ");
		cellphone.setManufact(keyboard.nextLine());

		System.out.print("Enter the model number: ");
		cellphone.setModel(keyboard.nextLine());

		System.out.print("Enter the retail price: ");
		cellphone.setRetailPrice(keyboard.nextDouble());

		System.out.println("Here is the data that you provided:");
		System.out.println("Manufacturer: " + cellphone.getManufact());
		System.out.println("Model: " + cellphone.getModel());
		System.out.println("Retail Price: RM" + cellphone.getRetailPrice());

		keyboard.close();
	}
}

