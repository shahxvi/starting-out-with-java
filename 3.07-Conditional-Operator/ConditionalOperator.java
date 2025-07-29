public class ConditionalOperator {

    public static void main(String[] args) {
        // a
        int x, y, z;

        x = 5;
        y = 6;

        z = x < y ? 1 : 20;
        System.out.println(z);

        // b
        float temp = 40;
        int population;
        int base = 3;

        population = temp > 45 ? base * 10 : base * 2;

        System.out.println("Population = " + population);

        // c
        int hours = 18;
        double wages = 0;
        wages *= hours > 40 ? 1.5 : 1;
        System.out.println("Wages = " + wages);

        int result = 0;

        System.out.println(
            result >= 0 ? "The result is positive" : "The result is negative"
        );
    }
}
