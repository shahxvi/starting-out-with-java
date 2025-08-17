import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;

public class EmployeeProgram {

	public static void main(String[] args) throws IOException {

		String stringInput;
		int numEmployee;
		String fileName;

		stringInput = JOptionPane.showInputDialog("Enter the number of employees you would like to key in");
		numEmployee = Integer.parseInt(stringInput);	

		fileName = JOptionPane.showInputDialog("Please enter the file name you would like to write to");

		File file = new File(fileName);

		PrintWriter outputFile = new PrintWriter(file);

		for (int i = 0; i < numEmployee; i++) {

			Employee employee = new Employee();

			stringInput = JOptionPane.showInputDialog("Enter employee #" + (i+1) + " name");
			employee.setName(stringInput);

			stringInput = JOptionPane.showInputDialog("Enter " + employee.getName() + " ID Number");
			employee.setIdNumber(Integer.parseInt(stringInput));

			stringInput = JOptionPane.showInputDialog("Enter " + employee.getName() + " department");
			employee.setDepartment(stringInput);

			stringInput = JOptionPane.showInputDialog("Enter " + employee.getName() + " position");
			employee.setPosition(stringInput);

			//Writing to an output file
			outputFile.println(employee.getName());
			outputFile.println(employee.getIdNumber());
			outputFile.println(employee.getDepartment());
			outputFile.println(employee.getPosition());
			outputFile.println();
		}

		JOptionPane.showMessageDialog(null, "Employees info written to " + fileName);
		outputFile.close();
		System.exit(0);
	}

}

