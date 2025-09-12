import javax.swing.JOptionPane;

public class MetricDemo {
	public static void main(String[] args) {
		String input;
		double miles;
		double kilometers;

		do {
			input = JOptionPane.showInputDialog("Which do you want to convert to?\n1. Miles to Kilometers\n2. Kilometers to Miles\n3. Exit\nPlease enter 1, 2 or 3");
			if (input.equals("1")) {
				input = JOptionPane.showInputDialog("Enter a distance in miles");
				miles = Double.parseDouble(input);
				kilometers = Metric.milesToKilometers(miles);
				JOptionPane.showMessageDialog(null, String.format("%,.2f miles equals %,.2f kilometers.", miles, kilometers));
			}
			else if (input.equals("2")) {
				input = JOptionPane.showInputDialog("Enter a distance in kilometers");
				kilometers = Double.parseDouble(input);
				miles = Metric.milesToKilometers(kilometers);
				JOptionPane.showMessageDialog(null, String.format("%,.2f kilometers equals %,.2f miles.", kilometers, miles));
			}
		}while (!input.equals("3"));
	}
}

