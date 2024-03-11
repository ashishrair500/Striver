//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      obj.convertMinToMaxHeap(n,a);
      for(int e : a)
      {
          System.out.print(e+" ");
      }
      System.out.println();
    }
  }
}

// } Driver Code Ends

 
//User function Template for Java

class Solution {
    
     static void heapify(int n,int arr[],int i){
        int largest=i;
        int leftchild=2*i+1;
        int rightchild=2*i+2;
        
        if(leftchild<n && arr[leftchild]>arr[largest]){
            largest=leftchild;
        }
        
        if(rightchild<n && arr[rightchild]>arr[largest]){
            largest=rightchild;
        }
        
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            
            heapify(n,arr,largest);
        }
    }
    
    static void convertMinToMaxHeap(int N, int arr[]) {
    // code here
     for(int i=N-1 ;i>=0; i--){
      heapify(N,arr,i);
      }
  }
}
     