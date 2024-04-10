//{ Driver Code Starts
// Initial template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            TreeSet<String> ans = new TreeSet<String>();
            ans = ob.allPossibleSubsequences(S);
            Iterator it = ans.iterator();
            if (ans.size() == 0) {
                System.out.print(-1);
            } else
                while (it.hasNext()) {
                    System.out.print(it.next() + " ");
                }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function template for Java

class Solution {
    static TreeSet<String> allPossibleSubsequences(String s) {
        // code here
        TreeSet<String> ts= new TreeSet<>();
        StringBuilder str=new StringBuilder();
        subseq(0,s,str,ts);
        
        return ts;
        
    }
    
    public static void subseq(int index,String s,StringBuilder str,TreeSet<String>ts){
        if(index==s.length()) {
            if((str.length()!=0)&&(str.charAt(0)=='a'||str.charAt(0)=='e'||str.charAt(0)=='i'||str.charAt(0)=='o'||str.charAt(0)=='u')&&(str.charAt(str.length()-1)!='a'&&str.charAt(str.length()-1)!='e'&&str.charAt(str.length()-1)!='i'&&str.charAt(str.length()-1)!='o'&&str.charAt(str.length()-1)!='u'))
           { ts.add(new String(str));
            return;
        } else return;
    }
         str.append(s.charAt(index));
         subseq(index+1,s,str,ts);
         str.deleteCharAt(str.length()-1);
         subseq(index+1,s,str,ts);
}
    
}