//{ Driver Code Starts
import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Is_LinkedList_Palindrom
{
	 Node head;  
	 Node tail;
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Solution g = new Solution();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
		
	}
}




// } Driver Code Ends


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		Node = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
   public static Node findMid(Node head){
        Node slow= head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow;
    }
         public static Node reverseList(Node head){
             Node curr=head;
             Node prev=null;
             Node next=null;
             
             while(curr!=null){
                 next=curr.next;
                 curr.next=prev;
                 prev=curr;
                 curr=next;
             }
             return prev;
    }
    
    public boolean isPalindrome(Node head) {
        if(head.next==null) return true;
        
       //find mid
    Node midnode=findMid(head);
        
        //reverse list
    Node temp=midnode.next;
    midnode.next=reverseList(temp);   
        
        //check palindrome
       Node head1=head;
      Node head2=midnode.next;
        
        while(head2!=null){
            if(head1.data!=head2.data){
                return false;
            }
            head1=head1.next;
            head2=head2.next;
        }
        
        //again reverse
         //reverse list
    temp=midnode.next;
    midnode.next=reverseList(temp);
        
        return true;   
}
}
