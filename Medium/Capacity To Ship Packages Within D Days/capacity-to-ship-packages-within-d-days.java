//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            int D = Integer.parseInt(read.readLine());
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.leastWeightCapacity(arr,N,D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static public boolean check(int [] arr,int N,int minweight,int D){
        int sum=0;
        int daycount=0;
        for(int i=0; i<N; i++){
          if(arr[i]+sum<=minweight){
              sum+=arr[i];
          }else{
              sum=arr[i];
              daycount++;
          }  
        }
        daycount++;
        if(daycount<=D) return true;
        else  return false;
    }
    static int leastWeightCapacity(int[] arr, int N, int D) {
        // code here
        int start=Integer.MIN_VALUE;
        int end=0;
        for(int i=0; i<N; i++) {
            start=Math.max(start,arr[i]);
             end=end+arr[i];
        }
    
    
        int mid=(start+end)/2;
        while(start<=end){
            mid=(start+end)/2;
            if(check(arr,N,mid,D)){
                end=mid-1;
            }else start=mid+1;
        }
        return start;
    }
};