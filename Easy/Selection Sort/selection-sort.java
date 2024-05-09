//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	int  select(int arr[], int i)
	{

            int min=Integer.MAX_VALUE;
            int minIndex=-1;
            for(int j=i; j<arr.length; j++){
               if(arr[j]<min){
                min=arr[j];
                minIndex=j;
              }
   
    }
     return minIndex;
        // code here such that selectionSort() sorts arr[]
}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0; i<n-1; i++){
	        int minIndex=select(arr,i);
	        int temp=arr[i];
	        arr[i]=arr[minIndex];
	        arr[minIndex]=temp;
	    }
	    
	}
}