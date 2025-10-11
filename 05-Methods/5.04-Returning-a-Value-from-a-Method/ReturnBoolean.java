public class ReturnBoolean {
	public static void main(String[] args) {
		int value = 20;

		System.out.println(isValid(value) ? "The value is within range.": "The value is out of range.");
	}

	public static boolean isValid(int number) {
		return number >=1 && number <= 100;
	}
}
	
