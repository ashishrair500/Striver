//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //optimal approach using binary search
    public static int page(int A [],int N,int pages){
        
        long pageStudent=0;
        int student=1;
        
        for(int i=0; i<N; i++){
            if((pageStudent+A[i])<=pages){
                pageStudent+=A[i];
            }else{
                student++;
                pageStudent=A[i];
            }
            
        }
        return student;
        
        
}
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        if(M>N) return -1;
        
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<N; i++){
            max=Math.max(max,A[i]);
            sum+=A[i];
        }
    
          int low=max;
          int high=sum;
          int countSt=0;
          int mid=(low+high)/2;
          while(low<=high){    
              mid=(low+high)/2;
              countSt=page(A,N,mid);
            
              if(countSt>M) low=mid+1;
              else high=mid-1;
    }
          return low;
    }
    
};