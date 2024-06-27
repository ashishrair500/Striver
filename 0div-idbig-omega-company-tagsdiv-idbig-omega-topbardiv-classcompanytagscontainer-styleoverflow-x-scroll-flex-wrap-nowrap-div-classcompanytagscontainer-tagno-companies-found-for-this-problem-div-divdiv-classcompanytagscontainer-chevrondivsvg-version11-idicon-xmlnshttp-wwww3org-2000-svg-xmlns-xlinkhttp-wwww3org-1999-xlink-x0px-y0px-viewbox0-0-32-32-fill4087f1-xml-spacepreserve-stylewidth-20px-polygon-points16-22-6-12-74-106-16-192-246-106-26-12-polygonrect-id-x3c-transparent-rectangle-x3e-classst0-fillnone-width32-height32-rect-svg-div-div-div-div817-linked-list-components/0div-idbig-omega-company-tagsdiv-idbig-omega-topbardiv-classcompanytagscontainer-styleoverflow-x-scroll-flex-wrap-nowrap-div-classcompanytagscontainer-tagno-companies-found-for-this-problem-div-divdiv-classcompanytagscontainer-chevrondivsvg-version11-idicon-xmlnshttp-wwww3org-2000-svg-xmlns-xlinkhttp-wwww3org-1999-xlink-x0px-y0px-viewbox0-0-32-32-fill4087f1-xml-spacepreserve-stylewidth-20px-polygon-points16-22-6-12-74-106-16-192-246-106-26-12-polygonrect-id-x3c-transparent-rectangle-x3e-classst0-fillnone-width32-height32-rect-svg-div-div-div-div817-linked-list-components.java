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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer>hs=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        boolean isPresented=true;
        int count=0;
        while(head!=null){
            isPresented=false;
            while(head!=null && hs.contains(head.val)){
                isPresented=true;
                head=head.next;
            }
            if(isPresented)
            count++;
        if(head!=null)
           head=head.next;
        }
               return count;
    }
}