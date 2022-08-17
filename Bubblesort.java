
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[]={7,8,3,1,2};

		//bubble sort

		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					//swap
					int temp = arr[j+1];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		printArray(arr);

	}

	public static void printArray(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
}

//Time Complexity = 0(n^2) as outer loops runs n-1 time and inner loop runs n/2, n/4 so total n-square 
