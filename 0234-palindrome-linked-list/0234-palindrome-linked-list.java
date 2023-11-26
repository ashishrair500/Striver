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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> ar= new ArrayList<>(); 
        ListNode temp=head;
    
        while(temp!=null){
            ar.add(temp.val);
            temp=temp.next;
            
        }
        
        for(int i=0; i<ar.size()/2; i++){
            if(ar.get(i)!=ar.get(ar.size()-1-i)){
                return false;
            }
           
        }
         return true;

    }
}