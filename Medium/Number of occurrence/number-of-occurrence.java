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
    int count(int[] arr, int n, int k) {
        // code here
        
        int low=0;
        int high=n-1;
        int mid= (low+high)/2;
        int ub=-1;
        while(low<=high){
            mid= (low+high)/2;
            if(arr[mid]>k){
                high=mid-1;
            }else if(arr[mid]<k){
                low=mid+1;
            }else{
                ub=mid;
                high=mid-1;
            }
        }
       
        
        
        low=0;
        high=n-1;
        int lb=-1;
       mid= (low+high)/2;
       
         while(low<=high){
             mid= (low+high)/2;
           if(arr[mid]>k){
                high=mid-1;
            }else if(arr[mid]<k){
                low=mid+1;
            }else{
                lb=mid;
                low=mid+1;
            }
         }
      
                 return lb<0?0:lb-ub+1;
               
               
               
               
    }
}