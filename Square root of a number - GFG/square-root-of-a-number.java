//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		// optimal solution using binary search
		
		long start=1;
		long end=x;
		long mid=(start+end)/2;
		
		while(start<=end){
		    
		     mid=(start+end)/2;
		     if(mid*mid<=x && (mid+1)*(mid+1)>=x){
		         if((mid+1)*(mid+1)==x) return mid+1;
		         
		         return mid;
		     }else{
		     
		     if(mid*mid>x) end=mid-1;
		     else if(mid*mid<x) start=mid+1;
		   }
		}
		
		return -1;
	 }
}
