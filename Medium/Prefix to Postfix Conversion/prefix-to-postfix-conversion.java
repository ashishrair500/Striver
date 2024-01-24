//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.preToPost(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String preToPost(String pre_exp) {
        // code here
        Stack<String> val= new Stack<>();
        for(int i=pre_exp.length()-1; i>=0; i--){
            char ch=pre_exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                String s=String.valueOf(ch);
                val.push(s);
            }
            else{
               
                String v1=val.pop();
                String v2=val.pop();
                String t=v1+v2+ch;
                val.push(t);
            }
            
            
        }
        
        return val.peek();
    }
}
