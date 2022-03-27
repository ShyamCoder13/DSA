
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
        ArrayList<Integer> A =new ArrayList<>();
        
        A.add(3);
        A.add(30);
        A.add(34);
        A.add(5);
        A.add(9);
        findlargestnumber(A);
	}

    static void findlargestnumber(ArrayList<Integer>A)
    {
      PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>(){
    
            public int compare(Integer o1, Integer o2) {
                String s1 = String.valueOf(o1);
                String s2 = String.valueOf(o2);
                String XY = s1 + s2;
                String YX = s2 + s1;
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
      
        });
     pq.addAll(A);
     StringBuilder sb=new StringBuilder();
     while(!pq.isEmpty())
     {
         sb.append(pq.poll());         
     }
  //   sb.charAt(0) == '0' ? "0" :sb.toString();
     System.out.println(sb);
    }
   
}


