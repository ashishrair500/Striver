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
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String S){
       
        if(S.length()==0) return 0;
         int max=Integer.MIN_VALUE;
        ArrayList<Character> arr =new ArrayList<>();
        for(int i=0; i<S.length(); i++){
           
            if(arr.contains(S.charAt(i))){
                
                int j=0;
                 while (j < arr.size() && arr.get(j) != S.charAt(i)) {
            j++;
        }
        if (j < arr.size()) {
            arr.subList(0, j + 1).clear(); // Remove elements from 0 to j
        }
            } arr.add(S.charAt(i));
              max=Math.max(max,arr.size());
        }
        
        return max;
    }
}