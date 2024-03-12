//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().convert(arr, n);
            for (int i = 0; i < n; i++) {
                out.print(arr[i] + " ");
            }
            out.println();
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    void convert(int[] arr, int n) {
        //Code here
   
          int b[] = arr.clone(); 
          Arrays.sort(b);
          HashMap<Integer,Integer> hm = new LinkedHashMap<>();
          for(int i=0; i<b.length; i++){
              
               hm.putIfAbsent(b[i], i);
              
          }
          
          for(int i=0; i<b.length; i++){
             int index=-1;
             if(hm.containsKey(arr[i]))
              index=hm.get(arr[i]);
              arr[i]=index;
              
          }
          
          
          
    }
}