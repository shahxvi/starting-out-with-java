public class SplitDemo3 {
        public static void main(String[] args) {
                // Create a string to tokenize
                String str = "joe@gaddisbooks.com";

                // Get the tokens, using @ and . as delimiters
                String[] tokens = str.split("[@.]");

                // Display the tokens
                for (String token : tokens)
                        System.out.println(token);
        }
}
