public class SearchArray {
	
	public static void main(String[] args) {
		int[] tests = {87, 75, 98, 100, 82};
		int results;

		results = sequentialSearch(tests, 100);

		System.out.println(results == -1 ? "You did not earn 100 on any test.": "You earned 100 on test " + (results + 1));
	}

	public static int sequentialSearch(int[] array, int value) {
		int index = 0;
		int element = -1;
		boolean found = false;

		while (!found && index < array.length) {
			if (array[index] == value) {
				element = index;
				found = true;
			}

			index++;
		}

		return element;
	}
}

