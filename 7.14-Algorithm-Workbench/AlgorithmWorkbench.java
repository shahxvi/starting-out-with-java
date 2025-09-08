public class AlgorithmWorkbench {
  public static void main(String[] args) {

    // 1
    int[] names = new int[20];
    for (int name : names) {
      System.out.println(name);
    }

    // 2
    int size = 100;
    int[] numberArray1 = new int[size];
    int[] numberArray2 = new int[size];

    for (int i = 0; i < size; i++) {
      numberArray2[i] = numberArray1[i];
    }

    // 3(a)
    String[] scientists = {"Einstein", "Newton", "Copernicus", "Kepler"};

    // 3(b) + 3(c)
    int totalStringLength = 0;
    for (String scientist : scientists) {
      System.out.println(scientist);
      totalStringLength += scientist.length();
    }
    System.out.println("The total length of all the strings of these scientists is " + totalStringLength);

    // 4
    int population = 20;
    int[][] country = new int[2][population]; // 2 Countries with 20 population each

    // Print the population using an enhanced for loop
    for (int[] countryPopulation : country) {  // Iterate over each country's population
      for (int person : countryPopulation) {  // Iterate over each person's data in the country
          System.out.print(person + " ");  // Print each person's value)
      }
      System.out.println();
    }

  }
}

