//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
 public static List<String> ans(String p, int open , int close,ArrayList<String>as){
        if(close==0 && open==0){
            as.add(p);
            return as;
        }
        if(open!=0) ans(p+'(', open-1 , close,as);
        if(close>open)  ans(p+')', open , close-1,as);
        return as;
    }
    public List<String> AllParenthesis(int n) 
    {
          return ans("",n,n,new ArrayList<String>());
        // Write your code here
    }
}