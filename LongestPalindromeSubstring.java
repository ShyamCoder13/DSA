import java.util.*;

class LongestPalindromeSubstring{
    public static void main(String args[])
    {
        String A="abccbbcbbddba";
        // int total=largestpalindromesubstring(A);
        // System.out.print(total);
        largestpalindromesubstring(A);
        
    }
    static void largestpalindromesubstring(String A)
    {
        //Length of String A
        int n=A.length();

        //Store DP states
        boolean [][]table=new boolean[n][n];

        //currently doing for Max. Length 1
        int maxlength=1;

        for(int i=0;i<n;i++)
        {
            table[i][i]=true;
        }
        

        //Check For Substring of Length 2

        int start=0;
        for(int i=0;i<n-1;i++)
        {
            if(A.charAt(i)==A.charAt(i+1))
            {
                table[i][i+1]=true;
                start=i;
                maxlength=2;
            }
        }
        System.out.println("\n"); 

        /*For printing matrix*/
        // for (boolean[] row : table)
        // {
        // System.out.println(Arrays.toString(row));  
        // }

        //Check for length greater than 2
        for(int k = 3; k <= n; ++k)
        {
            for(int i = 0; i < n - k + 1; ++i)
            {
                
                // Ending index of subString
                // of length k
                int j = i + k - 1;
    
                // Check for palindromic
                // subString str[i, j]
                if (table[i + 1][j - 1] &&
                    A.charAt(i) == A.charAt(j))
                {
                    
                    // Mark true
                    table[i][j] = true;
    
                    // Update the maximum length
                    if (k > maxlength)
                    {
                        start = i;
                        maxlength = k;
                    }
                }
        }
        
        
        }
        System.out.println(maxlength); 
}
}
