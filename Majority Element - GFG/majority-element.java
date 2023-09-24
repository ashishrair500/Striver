//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        //we can solve this proble using two loops in O(n^2) and using hashmap in O(n)
        //but for optimal approch we use moore voting machine
        int element=a[0];
        int count=0;
        for(int i=0; i<size; i++){
             if(count==0)element=a[i];
            if(element==a[i])count++;
            else{count--;}
           
                    }
        
        count=0;
          for(int i=0; i<size; i++){
              if(a[i]==element) 
              count++;
              
          }
        return count>size/2?element:-1;
    }
}