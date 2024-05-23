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
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode curr=head.next;
        ListNode prev=head;
        ListNode next=curr.next;
        head.next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            head=curr;
            curr=next;
        }
        
       
        return head;
    }
}