import java.util.*;
class KadanesAlgoformaximumsubarraysum{
    public static void main(String args[])
    {
        int A[]={5,6,7,-3,2,-10,-12,8,12,21,-4,7};
        int sum=0;
        int maxsum=A[0];

        for(int i=0;i<A.length;i++)
        {
            sum=sum+A[i];
            maxsum=Math.max(maxsum,sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        System.out.println(maxsum);
    }
 }
