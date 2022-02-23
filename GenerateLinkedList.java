class GenerateLinkedList {

    public static void main(String args[])
    {
        //Create Object Reference
        SingleLinkedList st=new SingleLinkedList();
        st.addNode(1);
        st.addNode(2);
        st.addNode(3);
        st.addNode(4);
        st.addNode(5);
        st.addNode(6);

        st.display();
    }
    static class SingleLinkedList
    {
        //Create a Linked List
        class Node{
            int data;
            Node next;
        
            //Intially Define Node and Data of Linked List
            public Node(int data)
            {
                this.data=data;
                this.next=null;
            }
        }
        
        //Represents Head and Tail of Singly Linked List

        public Node Head=null;
        public Node Tail=null;

        //Adding Operation in Linked List

        public void addNode(int Data)
        {
            //Create a New Node
            Node newNode=new Node(Data);

            //Check if the List is Empty
            if(Head==null)
            {
                //If List is Empty, Both Head and Tail Will Point to Same Node
                Head=newNode;
                Tail=newNode;
            }
            else
            {
                //newNode will Add After Tail such That, tail will point to next node
                Tail.next=newNode;
                //New Node will became new tail of List
                Tail=newNode;
            }
        }
           //For Calling display() to display nodes
            public void display()
            {
                Node current=Head;
                if(Head==null)
                {
                    System.out.println("List is Empty");
                    return;
                }
                while(current!=null)
                {
                    System.out.println(current.data);
                    current=current.next;
                }
            }
    }
   
}
