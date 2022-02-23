import java.util.*;
class ReverseStringUsingStack{
    public static void main(String args[])
    {
        StringBuilder S = new StringBuilder("shyam mehta");
        

        //String Length
        int n=S.length();

        //Create a Stack of Size n
        Stack st=new Stack(n);
        int i;

        //Iterate over string and push into stack
        for(i=0;i<n;i++)
        {
            st.push(S.charAt(i));
        }

        //Pop all the element from stack and store in string
        for(i=0;i<n;i++)
        {
            char ch=st.pop();
            S.setCharAt(i,ch);
        }


        System.out.println(S);
    }
 }

 //Create Stack
 class Stack
 {
     int top;
     char a[];
     int size;

     //Check stack is Empty or not
     boolean isEmpty()
     {
         return (top<0);
     }

     //Create Method Stack
     
     Stack(int n)
     {
        top=-1;
        size=n;
        a=new char[size];    
     }

     //Push Method
     boolean push(char x)
     {
         if(top>=size)
         {
             System.out.print("Stack is Overflow");
             return false;
         }
         else
         {
             a[++top]=x;
             return true;
         }
     }


     //Pop Method
     char pop()
     {
         if(top<0)
         {
             return 0;
         }
         else
         {
             char x=a[top--];
             return x;
         }
     }
 }
