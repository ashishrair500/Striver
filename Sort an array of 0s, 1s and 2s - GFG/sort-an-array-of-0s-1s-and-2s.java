//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int nums[], int n)
    {
        // code here 
        
         int index=0;
      //  int n=nums.length;
        for(int i=1; i<n; i++){
            if(nums[index]==2 && nums[i]!=2){
                
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index++;
            
            }else if(nums[index]!=2){
                index++;
                
            }
        }
        
        index=nums.length-1;
        for(int i=index-1; i>=0; i--){
            if(nums[index]==0&&nums[i]!=0)
            {
            
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index--;
            
            }else if(nums[index]!=0){
                index--;
                
            }
            
            
        }
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends