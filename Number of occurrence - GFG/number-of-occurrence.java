//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        
        // optimal approach using O(logn) time through lb and ub algo Binary search 
        
        int lb=-1;
        int ub=-1;
        int start=0;
        int end=n-1;
        int mid=(start+end)/2;

        while(start<=end)
        {
            mid=(start+end)/2;
            if(arr[mid]==x){
                lb=mid;
                end=mid-1;
            }else{
                if(arr[mid]>x)  end=mid-1;
                else start=mid+1;
            }
        }
        
        start=0;
        end=n-1;
        mid=(start+end)/2;
        
         while(start<=end)
         {
             mid=(start+end)/2;
             if(arr[mid]==x){
                 ub=mid;
                 start=mid+1;
             }else{
                 if(arr[mid]<x) start=mid+1; 
                 else end=mid-1;
             }
         }
        if(lb==-1) return 0;
        
        return ub-lb+1;

    }
}