//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int A[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0;i < n;i++)
            {
                A[i] = Integer.parseInt(s[i]);
            }
            int key = Integer.parseInt(in.readLine().trim());
            
            out.println(new Solution().search(A, 0, n - 1, key));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int search(int a[], int l, int h, int k)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        int mid=(l+h)/2;
        while(l<=h){
            mid=(l+h)/2;
            if(a[mid]<k){
                if(a[h]==k) return h;
               else if(a[mid]<a[h] && a[h]>k) l=mid+1;
               else if(a[mid]<a[h]) h=mid-1;
                else  l=mid+1;
               
               
              }
            else if(a[mid]>k){
                  if(a[l]==k)return l;
             else if(a[l]>k && a[l]>a[mid])  h=mid-1;
             else if(a[l]>k) l=mid+1;
                
                else h=mid-1;
            
            }
            else return mid;
        }
        
        
        return-1;
        
    }
}