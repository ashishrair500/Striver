/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public static ListNode findMid(ListNode head){
        ListNode slow= head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow;
    }
         public static ListNode reverseList(ListNode head){
             ListNode curr=head;
             ListNode prev=null;
             ListNode next=null;
             
             while(curr!=null){
                 next=curr.next;
                 curr.next=prev;
                 prev=curr;
                 curr=next;
             }
             return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        
       //find mid
    ListNode midnode=findMid(head);
        
        //reverse list
    ListNode temp=midnode.next;
    midnode.next=reverseList(temp);   
        
        //check palindrome
       ListNode head1=head;
      ListNode head2=midnode.next;
        
        while(head2!=null){
            if(head1.val!=head2.val){
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