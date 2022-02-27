
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=254;
        int sum=0;
        while(n>0 || sum>9)
        {
            if(n==0)
            {
                n=sum;
                sum=0;
            }
            sum=sum+n%10;
            n=n/10;
        }
        if(sum==1)
        {
            System.out.println("magic number");
        }
        else
        {
             System.out.println("not magic number");
        }
	}
}

