public class SelectionSortDemo {
  public static void main(String[] args) {
    int[] numbers = {4, 2, 1, 3, 5, 6};

    System.out.println("The unsorted array values are: ");
    for (int i : numbers) {
      System.out.println(i);
    }

    selectionSort(numbers);

    System.out.println("The sorted array values are: ");
    for (int i : numbers) {
      System.out.println(i);
    }
  }

  public static void selectionSort(int[] array) {
    int startScan, index, minIndex, minValue;

    for (startScan = 0; startScan < (array.length-1); startScan++) {
      minIndex = startScan;
      minValue = array[startScan];

      for (index = startScan + 1; index < array.length; index++) {
        if (array[index] < minValue) {
          minValue = array[index];
          minIndex = index;
        }
      }
      array[minIndex] = array[startScan];
      array[startScan] = minValue; 
    }

  }

}

