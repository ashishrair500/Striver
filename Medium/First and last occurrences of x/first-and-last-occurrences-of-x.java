//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Integer> find(int arr[], int n, int k)
    {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
       
        int low=0;
        int high=n-1;
        int mid= (low+high)/2;
        int ub=-1;
        while(low<=high){
            mid= (low+high)/2;
            if(arr[mid]>k){
                high=mid-1;
            }else if(arr[mid]<k){
                low=mid+1;
            }else{
                ub=mid;
                high=mid-1;
            }
        }
       
        
        
        low=0;
        high=n-1;
        int lb=-1;
       mid= (low+high)/2;
       
         while(low<=high){
             mid= (low+high)/2;
           if(arr[mid]>k){
                high=mid-1;
            }else if(arr[mid]<k){
                low=mid+1;
            }else{
                lb=mid;
                low=mid+1;
            }
         }
      
                 ans.add(0,ub);
                 ans.add(1,lb);
                 
                 
              return ans;
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Integer> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends