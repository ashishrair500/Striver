//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    Stack<Integer> val= new Stack<>();
    	    for(int j=0; j<n; j++){
    	        val.push(j);
    	    }
    	    
    	    
    	            while(val.size()>=2){
    	               int v1=val.pop();
    	               int v2=val.pop();
    	               if(M[v1][v2]==1){
    	                   val.push(v2);
    	               }else{
    	                   val.push(v1);
    	               }
    	            }
    	               
    	  int possCeleb=val.pop();
    	
    	

    	    for(int j=0; j<n; j++){
    	        if(M[possCeleb][j]!=0){
    	            return -1;
    	        }
    	    
         	}
         	 for(int j=0; j<n; j++){
         	  if(possCeleb==j) continue;
    	        if(M[j][possCeleb]!=1){
    	            return -1;
    	        }
    	    
         	}
    	    	    return possCeleb;
    }
}