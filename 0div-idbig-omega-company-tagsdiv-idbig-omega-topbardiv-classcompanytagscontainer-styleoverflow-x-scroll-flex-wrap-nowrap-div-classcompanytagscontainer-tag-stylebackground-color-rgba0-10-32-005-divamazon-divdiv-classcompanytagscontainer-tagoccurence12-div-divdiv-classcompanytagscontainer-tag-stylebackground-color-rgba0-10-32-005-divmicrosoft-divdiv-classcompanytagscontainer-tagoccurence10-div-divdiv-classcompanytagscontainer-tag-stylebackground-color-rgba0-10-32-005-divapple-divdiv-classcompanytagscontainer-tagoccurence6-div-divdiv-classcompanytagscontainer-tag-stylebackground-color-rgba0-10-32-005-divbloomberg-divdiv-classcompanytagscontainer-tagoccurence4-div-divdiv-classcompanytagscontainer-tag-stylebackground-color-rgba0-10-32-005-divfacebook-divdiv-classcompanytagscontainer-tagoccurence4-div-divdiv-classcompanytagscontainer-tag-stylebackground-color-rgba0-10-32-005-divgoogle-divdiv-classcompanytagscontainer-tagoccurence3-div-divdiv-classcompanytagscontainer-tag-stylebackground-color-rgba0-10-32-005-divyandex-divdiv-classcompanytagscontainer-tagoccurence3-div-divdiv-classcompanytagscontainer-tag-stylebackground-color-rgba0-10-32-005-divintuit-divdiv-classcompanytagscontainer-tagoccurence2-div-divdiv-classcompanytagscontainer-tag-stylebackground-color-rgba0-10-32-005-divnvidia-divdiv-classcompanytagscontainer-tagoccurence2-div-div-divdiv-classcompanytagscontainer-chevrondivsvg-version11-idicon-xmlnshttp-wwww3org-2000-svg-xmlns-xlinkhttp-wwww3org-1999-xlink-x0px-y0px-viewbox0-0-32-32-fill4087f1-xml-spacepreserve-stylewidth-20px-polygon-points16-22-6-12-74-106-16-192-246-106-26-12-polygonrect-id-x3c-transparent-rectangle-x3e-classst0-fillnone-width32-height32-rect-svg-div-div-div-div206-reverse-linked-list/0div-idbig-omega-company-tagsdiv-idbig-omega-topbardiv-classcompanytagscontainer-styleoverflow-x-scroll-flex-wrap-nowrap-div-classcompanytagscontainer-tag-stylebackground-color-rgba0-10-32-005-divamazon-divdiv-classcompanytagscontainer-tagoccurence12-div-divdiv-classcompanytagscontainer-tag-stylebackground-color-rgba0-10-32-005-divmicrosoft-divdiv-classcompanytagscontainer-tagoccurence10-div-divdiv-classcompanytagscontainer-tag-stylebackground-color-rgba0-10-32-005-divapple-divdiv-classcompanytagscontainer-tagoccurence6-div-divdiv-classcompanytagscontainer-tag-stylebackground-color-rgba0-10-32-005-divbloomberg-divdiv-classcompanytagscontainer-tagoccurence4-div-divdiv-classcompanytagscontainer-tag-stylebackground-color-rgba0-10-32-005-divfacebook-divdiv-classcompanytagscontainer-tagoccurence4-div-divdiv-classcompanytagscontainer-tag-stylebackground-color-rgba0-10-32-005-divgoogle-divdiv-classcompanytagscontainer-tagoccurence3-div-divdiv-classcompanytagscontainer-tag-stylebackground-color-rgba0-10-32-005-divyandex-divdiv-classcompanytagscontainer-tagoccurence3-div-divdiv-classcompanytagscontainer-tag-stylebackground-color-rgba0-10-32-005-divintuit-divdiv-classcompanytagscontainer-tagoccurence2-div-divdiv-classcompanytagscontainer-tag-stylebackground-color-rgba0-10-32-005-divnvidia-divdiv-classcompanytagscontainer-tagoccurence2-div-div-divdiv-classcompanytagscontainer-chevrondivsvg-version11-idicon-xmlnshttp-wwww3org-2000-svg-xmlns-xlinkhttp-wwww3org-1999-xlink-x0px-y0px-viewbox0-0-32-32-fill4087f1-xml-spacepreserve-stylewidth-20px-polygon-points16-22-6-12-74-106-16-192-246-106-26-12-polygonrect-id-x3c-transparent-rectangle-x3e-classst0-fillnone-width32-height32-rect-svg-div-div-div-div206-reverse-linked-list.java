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
    public ListNode reverseList(ListNode head) {
        
        ListNode temp=null;
        ListNode Pnext=head;
        
        while(Pnext!=null){
            
           ListNode hold=Pnext.next;
            Pnext.next=temp;
            temp=Pnext;
            Pnext=hold; 
            
        }
        
        
        return temp;
    }
}