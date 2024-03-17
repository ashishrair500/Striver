//{ Driver Code Starts
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class count_pairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n1 = sc.nextInt();
            Integer arr1[] = new Integer[n1];

            for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

            int n2 = sc.nextInt();
            Integer arr2[] = new Integer[n2];

            for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

            LinkedList<Integer> head1 = new LinkedList<>(Arrays.asList(arr1));
            LinkedList<Integer> head2 = new LinkedList<>(Arrays.asList(arr2));

            int x = sc.nextInt();
            Solution gfg = new Solution();
            System.out.println(gfg.countPairs(head1, head2, x));
        }
    }
}
// } Driver Code Ends


// your task is to complete this function

/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/



class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
        // Preprocess head2 into a HashSet for O(1) containment check
        // HashSet<Integer> set = new HashSet<>(head2);
        
        // int count = 0;
        // for (int i = 0; i < head1.size(); i++) {
        //     if (head1.get(i) < x && set.contains(Math.abs(head1.get(i) - x))) {
        //         count++;
        //     }
        // }
        
        // return count;
        
        
        int count=0;
        int h1s=head1.size();
        int h2s=head2.size();
        HashMap<Integer,Integer> map=new  HashMap<>();
        if(h1s>h2s)
        {
            for(int i=0;i<h2s;i++)
            {
                map.put(head2.remove(),0);
            }
            for(int i=0;i<h1s;i++)
            {
                int y=x-head1.remove();
                if(map.containsKey(y))
                {
                    count++;
                }
            }
            
        }
        else
        {
            for(int i=0;i<h1s;i++)
            {
                map.put(head1.remove(),0);
            }
            for(int i=0;i<h2s;i++)
            {
                int y=x-head2.remove();
                if(map.containsKey(y))
                {
                    count++;
                }
            }
            
        }
        
        return count;
    }
}

