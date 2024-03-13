//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  /*  public static void heapify(int[] arr, int n, int i) {
        int smallest = i;
        int lc = 2 * i + 1;
        int rc = 2 * i + 2;

        if (lc < n && arr[lc] < arr[smallest]) {
            smallest = lc;
        }
        if (rc < n && arr[rc] < arr[smallest]) {
            smallest = rc;
        }

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            heapify(arr, n, smallest);
        }
    }
*/
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        // Build a min heap
       /* for (int i = (r - 1) ; i >= 0; i--) {
            heapify(arr, r, i);
        }

        // Extract k elements from the heap
        for (int i = r; i >= r - k +1; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }

        // The kth smallest element is now at the root of the heap
        return arr[0];*/
        
        
        
        
        
        
         PriorityQueue<Integer> minHeap  = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            minHeap.offer(arr[i]);
        }
        for(int i=0; i<k-1; i++){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
