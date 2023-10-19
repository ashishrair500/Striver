//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static boolean canWePlace(int st[],int dist,int k){
        
        int cowCount=1;
        int last=st[0];
        
        for(int i=1; i<st.length; i++){
            
            if((st[i]-last)>=dist){
            cowCount++;
            last=st[i];
            }
            if(cowCount>=k) return true;

        }
        
        return false;
    }
    
    public static int solve(int n, int k, int[] st) {
        
        //brute force approach using
        Arrays.sort(st);
        int low=1;
        int high=st[n-1]-st[0];
        int mid=(low+high)/2;
        
        while(low<=high){
            mid=(low+high)/2;
            if(canWePlace(st,mid,k)){
                low=mid+1;
            }else high=mid-1;
            
            
        }
        return high;
    }
}