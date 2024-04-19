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
      int target = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      
      Solution obj = new Solution();
      int ans = obj.numberOfSubarrays(a, n, target);
      System.out.println(ans);
    }
  }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    int numberOfSubarrays(int arr[], int n, int target){
          int sum=0,ans=0,i=0,temp=0;
      
      for(int j=0;j<n;j++)
      {   
          sum=sum+arr[j];
          if(arr[j]==1)
           temp=0;
        while(sum==target)
         {  
             
           temp++;
           sum=sum-arr[i];
           i++;
         }
        ans=ans+temp;
      }
      return ans;
        // code here
   } 
   
}