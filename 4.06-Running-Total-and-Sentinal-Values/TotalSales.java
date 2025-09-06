import javax.swing.JOptionPane;

public class TotalSales {

    public static void main(String[] args) {
        int days;
        double sales;
        double totalSales = 0.0;
        String input;

        input = JOptionPane.showInputDialog(
            "For how many days do you have sales figure?"
        );
        days = Integer.parseInt(input);

        for (int count = 1; count <= days; count++) {
            input = JOptionPane.showInputDialog(
                "Enter the sales for day " + count
            );
            sales = Double.parseDouble(input);

            totalSales += sales;
        }

        JOptionPane.showMessageDialog(
            null,
            String.format("The total sales are %,.2f", totalSales)
        );

        System.exit(0);
    }
}
