//Time Complexity : O(nlogn)
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{

    public static void conquer(int arr[], int si, int mid, int ei)
    {
        //Creating new Merged Array to store sorted part
        int merged[] = new int[ei - si + 1];

        //Creating 2 index to check merged part
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        //Sort till the index 1 reaches mid and 2nd index less than last index
        while(idx1 <= mid && idx2 <= ei) {
            if(arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        //Running Another Loop to check if there are any remaining element, if remains, we will add as it is, as it is already sorted
        while(idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while(idx2 <= mid) {
            merged[x++] = arr[idx2++];
        }

        //Copy Merged element to original array

        for(int i=0, j=si; i<merged.length; i++, j++) {
            arr[j]=merged[i];
        }

    }

    public static void divide(int arr[], int si, int ei) {
        
        //Base Condition
        if(si >= ei){
            return;
        }
        
        int mid=si+(ei-si)/2; //Equivalent to (si+ei)/2
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {6, 3, 9, 5, 1, 8};
        int n=arr.length;
        divide(arr, 0, n-1);

        //Print the array
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}
}

