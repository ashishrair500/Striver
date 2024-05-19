//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findOnce(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    int findOnce(int arr[], int n)
    {
        if(n==1) return arr[0];
        if(n==2 && arr[0]!=arr[1]) 
        return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
    
      int low=0;
      int high =n-1;
      int mid=(low+high)/2;
      while(low<=high){
          mid=(low+high)/2;
          if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
              return arr[mid];
          }
         
         if(arr[mid]==arr[mid-1] && (mid-1)%2==0){
                low=mid+1;
            }else if(arr[mid]==arr[mid+1] && (mid+1)%2==1){
                
                low=mid+1;
            }else high=mid-1;
          
          
      }
    
    return -1;
    }
}