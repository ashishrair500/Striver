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
    public ListNode rotateRight(ListNode head, int k) {
       if (head == null || head.next == null || k == 0) {
			return head;
		}

		ListNode tail = head;
		int size = 1;

		while (tail.next != null) {
			size++;
			tail = tail.next;
		}

		int rotationCount = k % size;
		tail.next = head;
 
		for (int i = 0; i < size - rotationCount; i++) {
			tail = tail.next;
		}
    
    
		head = tail.next;
		tail.next = null;

		return head;
    }
}