//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int index=0;
        for(int i=1; i<n; i++){
            if(a[index]!=0 && a[i]==0){
                int temp=a[index];
                a[index]=a[i];
                  a[i]=temp;
                  index++;
            }else if(a[index]==0) index++;
            
        }
        index=n-1;
        for(int i=n-2; i>=0; i--){
            if(a[index]!=2 && a[i]==2){
                int temp=a[index];
                a[index]=a[i];
                  a[i]=temp;
                  index--;
            }else if(a[index]==2) index--;
            
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