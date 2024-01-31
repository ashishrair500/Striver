//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        StringBuilder str= new StringBuilder();
        String st []= S.split("[.]");
        
        for(int i=st.length-1; i>=0; i-- ){
            str.append(st[i]);
            str.append('.');
            
        }
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }
}