//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    static int get(char ch){
        switch (ch){
        case 'M': return 1000;
        case 'D': return 500;
        case 'C': return 100;
        case 'L': return 50;
        case 'X': return 10;
        case 'V': return 5;
        case 'I': return 1;
        default: return 0;
        }
    }
    public int romanToDecimal(String str) {
        // code here
        int sum=0; 
        
        for(int i=0 ;i<str.length(); i++){
            if(i+1<str.length()&&get(str.charAt(i))<get(str.charAt(i+1))){
                sum-=get(str.charAt(i));
            }else{
                sum+=get(str.charAt(i));
            }
        } 
        return sum;
    }
}