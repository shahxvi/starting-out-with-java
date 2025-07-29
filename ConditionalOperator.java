public class ConditionalOperator {

    public static void main(String[] args) {
        int x, y, z;

        x = 5;
        y = 6;

        /*
        if (x > y)
             z = 1;
        else
             z = 20;
        */
        z = x < y ? 1 : 20;
        System.out.println(z);

        float temp = 40;
        int population;
        int base = 3;

        population = temp > 45 ? base * 10 : base * 2;

        System.out.println("Population = " + population);
    }
}
