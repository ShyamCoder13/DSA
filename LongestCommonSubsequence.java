//Given two sequences, print the longest subsequence present in both of them.

//Examples: 

//LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3. 
//LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String a = "abbcdgf";
        String b = "bbadcgf";

        int m = a.length();
        int n = b.length();

        getLCS(a,b,m,n);

        //System.out.println(LCS);

        
	}

    static void getLCS(String a, String b, int m, int n) {
        int [][]L =new int[m+1][n+1];


        //Length of Longest Common Subsequence
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= m; j++) {
                //Base Condition
                if(i==0 || j==0) { L[i][j]=0; }
                else if(a.charAt(i-1) == b.charAt(j-1)) { L[i][j]=L[i-1][j-1]+1; }
                else { L[i][j] = Math.max(L[i-1][j],L[i][j-1]); }
                 //System.out.println(L[i][j]);
            }
        }
        //System.out.println(L[m][n]);
       
        //Printing the Longest Common Subsequence
        int index = L[m][n];
        int temp=index;

        //Create a empty array
        char[] lcs = new char[index + 1];
        lcs[index] = '\u0000';


        int i=m; int j=n;

        while(i > 0 && j > 0) {
            if(a.charAt(i-1) == b.charAt(j-1)) {
                lcs[index-1] = a.charAt(i-1);
                i--;
                j--;
                index--;
            }
            else if(L[i-1][j] > L[j-1][i]) {
                i--;
            }
            else {
                j--;
            }
        }

        for(int k=0;k<temp;k++) {
            System.out.println(lcs[k]);
        }



    }

}

