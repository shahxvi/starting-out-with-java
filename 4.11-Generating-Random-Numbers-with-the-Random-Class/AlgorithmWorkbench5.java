public class AlgorithmWorkbench5 {
	public static void main(String[] args) {

		double accumulator = 0.0;

		for (double i = 1, j = 30; i <= 30; i++, j--) {
			accumulator += i / j; 
		}

		System.out.println(accumulator);
	}
}

