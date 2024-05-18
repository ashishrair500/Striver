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
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findMin(A, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int findMin(int nums[], int n)
    {
        //complete the function here
         int min= Integer.MIN_VALUE;
        int low=0;
        int high=nums.length-1;
        int mid=(low+high)/2;
        
        if(nums.length==1) return nums[0];
        if(nums.length==2 && nums[0]<nums[1]) return nums[0];
        else if(nums.length==2 && nums[0]>nums[1]) return nums[1];
        
        while(low<high){
            mid=(low+high)/2;
            
            if(mid>0 && mid<nums.length-1 && nums[mid]<nums[mid-1] && nums[mid]<nums[mid+1])  return nums[mid];
            if(nums[high]<nums[mid]) low=mid+1;
            else high=mid-1;
        }
         mid=(low+high)/2;
         return nums[mid];
    }
}
