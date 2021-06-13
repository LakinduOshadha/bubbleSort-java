import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class TestBubbleSort {
    /**
     * main
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        BubbleSort bubbleSortObj = new BubbleSort();

        // Giving an Introduction to the user
        System.out.print("This program will sort integer numbers in given array using bubble sort.\n" + "n - " +
                "number of integers in input array.\n" + "Enter input array size(n): ");

        // Getting input size from user
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        // Getting the unsorted array from the user
        int array[] = new int[n];
        int inputSize = 0;
        String input;
        do {
            System.out.print("Enter " + n + " integers, separated using space, to sort (n1 n2 n3 ...): ");
            input = reader.readLine();
            inputSize = input.split(" ").length;
        } while (inputSize != n);

        String[] numbers = input.split(" ");
        for (int j = 0; j < n; j++) {
            array[j] = Integer.parseInt(numbers[j]);
        }

        // Declaring a new array to assign to the return array
        int sortedArr[] = new int[n];

        // Calling & printing results :  Version 1
        sortedArr = bubbleSortObj.bubbleSort(array.clone());  // Calls bubbleSort method with a clone of the "array".
        bubbleSortObj.printReport("BubbleSort Version 1",array,sortedArr,bubbleSortObj.getComparisons(),
                bubbleSortObj.getExchanges());  // Prints results

        // Calling & printing results :  Version 2
        sortedArr = bubbleSortObj.bubbleSort2(array.clone());  // Calls bubbleSort2 method with a clone of the "array".
        bubbleSortObj.printReport("BubbleSort Version 2",array,sortedArr,bubbleSortObj.getComparisons(),
                bubbleSortObj.getExchanges());  // Prints results

        // Calling & printing results :  Version 3
        sortedArr = bubbleSortObj.optimizedBubbleSort(array.clone());  // Calls optimizedBubbleSort method with a clone of the "array".
        bubbleSortObj.printReport("BubbleSort Version 3 (Optimized)",array,sortedArr,bubbleSortObj.getComparisons(),
                bubbleSortObj.getExchanges());  // Prints results

    }
}
