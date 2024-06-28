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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null) return head;
        if(left==right) return head;
        ListNode prev =null;
        ListNode curr=head;
        ListNode Next=head.next;
        
        ListNode Left =null;
        ListNode leftone =null;
        
         //ListNode right =null;
        for(int i=0; i<left; i++){
            if(Next==null) break;
            prev=curr;
            curr=Next;
            Next=Next.next;
            if(i==left-2)Left=prev;
        }    
           leftone=prev;
        
        for(int i=1; i<=right-left; i++){
            curr.next=prev;
            prev=curr;
            curr=Next;
            if(Next==null) break;
            Next=Next.next;
        }  
            if(Left!=null && Left!=prev){
             Left.next=prev;
            }
           if(leftone!=Left) leftone.next=curr;
        
    return left==1?prev:head;
    }
}