//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int mid, int h)
    {
        ArrayList<Integer> as= new ArrayList<>();
        int left=l;
        int right=mid+1;
        
        while(left<=mid &right<=h){
            if(arr[left]<=arr[right]){
            as.add(arr[left]); left++;
            }else{
                as.add(arr[right]); right++;
                
            }
            
        }
        //for remainnig elements left side
        while(left<=mid){
            as.add(arr[left]); left++;
        }
          //for remainnig elements rigth side
          while(right<=h){
                as.add(arr[right]); right++;
        }
        
        
        
        for(int i=l; i<=h; i++){
            
            arr[i]=as.get(i-l);
            
        }
         // Your code here
    }
    void mergeSort(int arr[], int l, int h)
    {
        if(l>=h) return;
        int mid=(l+h)/2;
        
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,h);
        merge(arr,l,mid,h);
        
        
        //code here
    }
}
