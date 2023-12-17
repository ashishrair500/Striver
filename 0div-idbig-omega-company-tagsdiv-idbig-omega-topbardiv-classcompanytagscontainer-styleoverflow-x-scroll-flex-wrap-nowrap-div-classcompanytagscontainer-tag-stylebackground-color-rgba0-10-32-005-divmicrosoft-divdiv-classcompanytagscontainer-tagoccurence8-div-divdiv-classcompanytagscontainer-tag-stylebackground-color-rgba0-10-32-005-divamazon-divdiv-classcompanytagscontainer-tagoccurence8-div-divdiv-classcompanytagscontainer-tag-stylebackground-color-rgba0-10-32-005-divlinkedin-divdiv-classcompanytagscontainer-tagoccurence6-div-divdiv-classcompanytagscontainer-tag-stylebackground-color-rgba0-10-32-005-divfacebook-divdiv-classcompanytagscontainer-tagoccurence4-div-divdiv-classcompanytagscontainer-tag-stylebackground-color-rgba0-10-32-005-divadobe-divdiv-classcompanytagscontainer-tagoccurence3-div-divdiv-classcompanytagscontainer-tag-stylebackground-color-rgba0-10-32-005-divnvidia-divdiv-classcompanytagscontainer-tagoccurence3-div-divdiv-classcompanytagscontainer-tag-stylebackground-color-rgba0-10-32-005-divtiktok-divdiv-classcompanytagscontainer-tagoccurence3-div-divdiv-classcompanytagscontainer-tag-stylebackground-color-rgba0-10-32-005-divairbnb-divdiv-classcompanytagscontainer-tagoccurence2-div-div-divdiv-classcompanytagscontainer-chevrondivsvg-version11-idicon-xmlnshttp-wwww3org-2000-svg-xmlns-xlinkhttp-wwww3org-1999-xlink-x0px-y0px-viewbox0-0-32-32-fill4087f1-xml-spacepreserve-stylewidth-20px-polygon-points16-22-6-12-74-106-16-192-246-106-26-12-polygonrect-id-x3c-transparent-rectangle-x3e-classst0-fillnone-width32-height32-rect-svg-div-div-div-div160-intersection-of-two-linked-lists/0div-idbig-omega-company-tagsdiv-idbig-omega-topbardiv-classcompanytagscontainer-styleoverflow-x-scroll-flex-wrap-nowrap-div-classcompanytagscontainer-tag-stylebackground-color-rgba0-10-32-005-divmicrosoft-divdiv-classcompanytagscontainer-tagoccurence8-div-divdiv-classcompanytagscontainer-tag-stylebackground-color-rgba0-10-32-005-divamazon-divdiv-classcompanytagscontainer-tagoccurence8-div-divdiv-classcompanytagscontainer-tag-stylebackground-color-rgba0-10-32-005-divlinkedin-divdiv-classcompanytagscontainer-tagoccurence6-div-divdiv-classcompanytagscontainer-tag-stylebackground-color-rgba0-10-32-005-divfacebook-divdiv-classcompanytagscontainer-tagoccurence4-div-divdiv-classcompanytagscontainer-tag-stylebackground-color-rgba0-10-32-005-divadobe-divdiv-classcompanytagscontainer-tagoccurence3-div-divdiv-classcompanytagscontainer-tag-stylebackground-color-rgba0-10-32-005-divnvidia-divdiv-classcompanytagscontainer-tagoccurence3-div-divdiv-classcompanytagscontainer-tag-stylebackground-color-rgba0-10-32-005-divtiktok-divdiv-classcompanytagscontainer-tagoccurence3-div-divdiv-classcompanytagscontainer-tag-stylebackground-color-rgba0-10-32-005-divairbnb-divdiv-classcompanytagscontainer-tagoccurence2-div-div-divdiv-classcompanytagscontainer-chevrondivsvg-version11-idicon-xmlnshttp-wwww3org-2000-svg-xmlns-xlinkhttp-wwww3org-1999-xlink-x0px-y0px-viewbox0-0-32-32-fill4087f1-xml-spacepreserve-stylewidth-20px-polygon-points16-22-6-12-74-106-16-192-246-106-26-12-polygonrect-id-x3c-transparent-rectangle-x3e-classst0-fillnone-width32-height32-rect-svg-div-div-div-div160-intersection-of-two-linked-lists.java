/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode tempA=headA;
    ListNode tempB =headB;
        
        if(headA==null || headB==null) return null;
        
        while(tempA!=tempB){
           
            tempA=tempA.next;
            tempB=tempB.next;
            
            if(tempA==tempB) return tempA;
            if(tempA==null) tempA=headB;
            if(tempB==null) tempB=headA;
        }
        
       return tempA;
        /*approach 2 time Complexity 5n
        
        int countA=0;
        int  countB=0;
            while(temp1!=null){
                    temp1=temp1.next;
                    countA++;
            }
           while(temp2!=null){
                    temp2=temp2.next;
                    countB++;
            }
        
          temp1=headA;
          temp2 =headB;
          while(countA>countB){
            countA--;
            temp1=temp1.next;
          }
        
          while(countA<countB){
            countB--;
            temp2=temp2.next;
          }
        
          while(temp1!=null){
            if(temp1==temp2) return temp1;
            temp1=temp1.next;
            temp2=temp2.next; 
         }
        
        
        /* approach 1 O n^2;
    while(temp1!=null){
        temp2=headB;
        while(temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp2=temp2.next;
    }
        
        temp1=temp1.next;
       }*/
        
        //return null;
    }
}