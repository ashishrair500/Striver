//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        StringBuilder sb= new StringBuilder(arr[0]);
        
      
        for(int i=0; i<n; i++){
            if(arr[i].length()==0) return "";
            
            int j=0;
            while(arr[i].length()>j && sb.length()>j){
                if(sb.charAt(j)!=arr[i].charAt(j)){
              break;
                }
                j++;
               
            } sb.setLength(j);
        }
        return sb.toString().length()==0?"-1":sb.toString();
    }
}