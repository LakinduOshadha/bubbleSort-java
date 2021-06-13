import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Lakindu Oshadha (lakinduoshadha98@gmail.com)
 */
public class BubbleSort {
    /**
     * Declaring global variables to track No of comparisons & exchanges.
     */
    private int comparisons = 0;
    private int exchanges = 0;

    public int getComparisons() {
        return comparisons;
    }

    public int getExchanges() {
        return exchanges;
    }

    /**
     * bubbleSort : Simple Bubble sort without any optimization (Version 1)
     * @param arr  UnSorted Array
     * @return Sorted Array : In ascending order
     */
    public int[] bubbleSort(int[] arr) {
        // Initializing local variables
        int n = arr.length; 
        int temp = 0;
        // Making the counts to 0
        comparisons = 0;
        exchanges = 0;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    // Swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    exchanges++ ;   // Count of exchanges increases by 1 with every swap
                }
                comparisons++ ;  // Count of comparisons increases by 1 with every comparison
            }
        }
        return arr;
    }
    /**
     * bubbleSort2 : Bubble sort with optimization (Version 2)
     * @param arr Unsorted Array
     * @return Sorted Array : In ascending order
     */
    public int[] bubbleSort2(int[] arr){
        // Initializing local variables
        int n = arr.length;
        boolean swapped = false;    //to check any swapping was done or not in previous iteration.
        int temp = 0;
        // Making the counts to 0
        comparisons = 0;
        exchanges = 0;
        
        for (int i = n -1; i > 0; i--){
            swapped = false;
            for (int j = 1; j <= i ; j++){
                if(arr[j - 1] > arr[j]){
                    // Swap elements
                    temp = arr[j -1];
                    arr[j -1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                    exchanges++ ;   // Count of exchanges increases by 1 with every swap
                }
                comparisons++ ;  // Count of comparisons increases by 1 with every comparison
            }
            // If there is no swapping done, the array is already sorted.
            if(!swapped){
                break;
            }
        }
        return arr;
    } 
    /**
     * optimizedBubbleSort : Well optimized Bubble sort (Version 3)
     * @param arr Unsorted Array
     * @return Sorted Array : In ascending order
     */
    public int[] optimizedBubbleSort(int[] arr){
        // Initializing local variables
        int n = arr.length - 1;
        boolean swapped = false;    // To check any swapping was done or not in previous iteration.
        int temp = 0;
        int newLimit = 0;   // To set new limit of for loop
        // Making the counts to 0
        comparisons = 0;
        exchanges = 0;
        
        do{
            swapped = false;
            for(int i = 1; i <= n; i++){
                if(arr[i - 1] > arr[i]){
                    temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                    newLimit = i -1 ;
                    exchanges++ ;
                }
                comparisons++ ;
            }
            n = newLimit;   // Avoids sorting sorted part of the array again.
            
        }while(swapped);    // If any swapping was not happend in previous iteration,while loop ends.
        return arr;
    }
    /**
     * printReport : Prints the results of given algorithm in proper manner.
     * @param nameAlgo Name of the algorithm
     * @param unSorted Unsorted Array
     * @param sorted Sorted Array
     * @param comparisons No. of Comparisons
     * @param exchanges No.of Exchanges
     */
    public void printReport(String nameAlgo, int[] unSorted, int[] sorted, int comparisons, int exchanges){
        System.out.println("\n" + "Algorithm : " + nameAlgo);
        System.out.println("Unsorted Array : " + Arrays.toString(unSorted));
        System.out.println("Sorted Array : " + Arrays.toString(sorted));
        System.out.println("No. of Comparisons : " + comparisons);
        System.out.println("No. of Exchanges : " + exchanges );
        
    }
}
