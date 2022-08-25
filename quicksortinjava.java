// Performing Quick Sort
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    //Partition Function
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++) {
            if(arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //Now putting pivot to its correct position
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pivotindex  = partition (arr, low, high);
            quickSort(arr, low, pivotindex-1);
            quickSort(arr, pivotindex+1, high);
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception {
		//Creating an Array
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n=arr.length;

        quickSort(arr, 0, n-1);

        //print
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    
	}
}

