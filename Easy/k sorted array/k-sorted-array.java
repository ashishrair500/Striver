//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{ 
    
    /*public static int heapify(int [] arr, int i,int k){
        int n= arr.length;
        int smallest=i;
        int lc=2*i+1;
        int rc=2*i+2;
        if(lc<n && arr[lc]<arr[smallest])
        smallest=lc;
        if(rc<n && arr[rc]<arr[smallest])
        smallest=rc;
      
       
        if(smallest!=i) {
            int temp=arr[smallest];
            arr[smallest]= arr[i];
            arr[i]=temp;
            heapify(arr,smallest,k);
        }
         if(Math.abs(smallest-i)>k)return 0;
        return 1;
    }*/
    static String isKSortedArray(int arr[], int n, int k) 
    { 
        // code here
       
    //     for(int i=n-1; i>=0; i--){
    //       int x=heapify(arr,i,k);
    //       if(x==0) return "No";
    //     }
        
        
    //   return "Yes";
    HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0 ; i<arr.length ; i++){
            map.put(arr[i], i);
        }
        
        Arrays.sort(arr);
        
        for(int i =0 ; i<arr.length ; i++){
            if(Math.abs(map.get(arr[i])-i)>k){
                return "No";
            }
        }
        return "Yes";
    }

}

//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		// looping through all testcases
		while(testcases-- > 0){
		    int n=Integer.parseInt(br.readLine());
		    String line1 = br.readLine();
		    String[] a1 = line1.trim().split("\\s+");
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=Integer.parseInt(a1[i]);
		    }
		    int k=Integer.parseInt(br.readLine());
		    Solution ob=new Solution();
		    String ans=ob.isKSortedArray(a,n,k);
		    System.out.println(ans);
		    
		}
	}
}
// } Driver Code Ends