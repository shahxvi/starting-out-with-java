public class SplitDemo2 {
        public static void main(String[] args) {
                // Create a string to tokenize
                String str = "one and two and three and four";

                // Get the tokens, using a space delimiter
                String[] tokens = str.split(" and ");

                // Display the tokens
                for (String token : tokens)
                        System.out.println(token);
        }
}
