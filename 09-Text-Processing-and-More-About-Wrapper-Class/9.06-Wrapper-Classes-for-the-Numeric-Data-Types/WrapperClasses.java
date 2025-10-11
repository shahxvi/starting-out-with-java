import java.util.ArrayList;

public class WrapperClasses {
        public static void main(String[] args) {
                int i = 12;
                double d = 14.95;
                String str1 = Integer.toString(i);
                String str2 = Double.toString(d);
                System.out.println(str1);
                System.out.println(str2);

                // toBinaryString, toHexString, toOctalString
                int number = 14;
                System.out.println(Integer.toBinaryString(number));
                System.out.println(Integer.toHexString(number));
                System.out.println(Integer.toOctalString(number));

                // Numeric wrapper MIN_VALUE and MAX_VALUE constants
                System.out.println("The minimum value for an int is " + Integer.MIN_VALUE);
                System.out.println("The maximum value for an int is " + Integer.MAX_VALUE);

                // Autoboxing and Unboxing
                Integer number2 = 7; // Autoboxes the value 7
                int primitiveNumber = number2; // Unboxes the object

                // Storing wrapper class object in an ArrayList
                ArrayList<Integer> list = new ArrayList<>();

                Integer myInt = 5;
                list.add(myInt);
                // or list.add(5);

                // Unboxing value
                primitiveNumber = list.get(0);
                System.out.println(primitiveNumber);
        }
}
