//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        
        
        int digit=1;
        int number =n;
        int sum=0;
        int square=1;
       String s=String.valueOf(n);
       
       for(int i=0; i<s.length(); i++){
           digit=number%10;
           number=number/10;
           
           for(int j=0; j<s.length(); j++){
           
               square=square*digit;
               
           }
           sum=sum+square;
           square=1;
       }
       
       if(sum==n) return "Yes";
       else return "No";
        // code here
    }
}