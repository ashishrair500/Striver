//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int h = sc.nextInt();
            Solution obj = new Solution();
            int ans = obj.Solve(n,a,h);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int Solve(int N, int[] piles, int H) {
        // code here
        int end=Integer.MIN_VALUE;
        int start=Integer.MAX_VALUE;
        
        for(int i=0; i<N; i++){
           start= Math.min(piles[i],start);
           end= Math.max(piles[i],end);
        }
        start=1;
        int checkHour=0;
        int mid=(start+end)/2;
        int rem=0;
        while(start<=end){
            mid=(start+end)/2;
             checkHour=0;
             rem=0;
            for(int i=0; i<piles.length; i++){
                rem=(int)Math.ceil((double)piles[i]/(double)mid);
                checkHour+=rem;
                if(checkHour>H){
                    start=mid+1;
                    break;
                }
                
            }
            
         //   if(checkHour==h) return mid;
            if(checkHour<=H) end=mid-1;
            
        }
        
        
        return start;
        
        
    }
}
        
