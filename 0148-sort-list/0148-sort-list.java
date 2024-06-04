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
    public ListNode sortList(ListNode head) {
        if(head==null) return head;
        ArrayList<Integer> ar = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            ar.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(ar);
      head= new ListNode(ar.get(0));
      temp=head;
     for(int i=1; i<ar.size(); i++){
         ListNode newNode=new ListNode(ar.get(i));
         temp.next=newNode;
         temp=temp.next;
         }   
        return head;
    }
}
