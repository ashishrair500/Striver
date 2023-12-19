//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    
    public static Node reverse(Node head){
          
        Node prev= null;
        Node curr= head;
        Node Next= null;
                                     
                                                                                                                                                                                                                                                  
        while(curr!=null){         
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
            
        }
        
        return prev;
        
    }
    public static Node addOne(Node head) 
    { 
        //code here.
        /*
      //  wrong approch because of linked list size
        if(head==null)return null;
        Node temp=head.next;
        Long num=head.data;
        while(temp!=null){
            num=num*10+temp.data;
            temp=temp.next;
        }
       num=num+1;
        int digit =num%10;
        num=num/10;
        Node prev =new Node(digit);
        
        while(num!=0){
            digit=num%10;
            Node initial=new Node(digit);
            initial.next=prev;
            prev=initial;
            num=num/10;
        }
        return prev;
        */
        
    head=reverse(head);
        
    Node temp= head;
    int carry=1;
    
    while(temp!= null){
    temp.data=temp.data+1;
    if(temp.data<10){
           carry=0;
           break;
    }else{
   
        temp.data=0;
        carry=1;
    }
        temp=temp.next;
    }
      
      head=reverse(head);  
        if(carry==1){
            Node extra= new Node(1);
            extra.next=head;
            head=extra;
        }
        
        return head;
        
    }
}
