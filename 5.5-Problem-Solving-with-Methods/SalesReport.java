import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;

public class SalesReport {

	public static void main(String[] args) throws IOException {
		final int NUM_DAYS = 30;

		double totalSales = getTotalSales(getFileName());
		double averageSales = totalSales / NUM_DAYS;
		displayResults(totalSales, averageSales);

	}

	public static String getFileName() {
		return JOptionPane.showInputDialog("Enther the name of the file/nContaining 30 days of sales amounts.");
	}
	
	public static double getTotalSales(String fileName) throws IOException {
	
		double sales;
		double total = 0.0;

		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);

		while (inputFile.hasNext()) {
			sales = inputFile.nextDouble();
			total += sales;
		}

		inputFile.close();
		
		return total;
	}

	public static void displayResults(double total, double average) {
		JOptionPane.showMessageDialog(null, String.format("The total sales for the period is RM%,.2f\nThe average daily sales were RM%,.2f", total, average));
	}
}

