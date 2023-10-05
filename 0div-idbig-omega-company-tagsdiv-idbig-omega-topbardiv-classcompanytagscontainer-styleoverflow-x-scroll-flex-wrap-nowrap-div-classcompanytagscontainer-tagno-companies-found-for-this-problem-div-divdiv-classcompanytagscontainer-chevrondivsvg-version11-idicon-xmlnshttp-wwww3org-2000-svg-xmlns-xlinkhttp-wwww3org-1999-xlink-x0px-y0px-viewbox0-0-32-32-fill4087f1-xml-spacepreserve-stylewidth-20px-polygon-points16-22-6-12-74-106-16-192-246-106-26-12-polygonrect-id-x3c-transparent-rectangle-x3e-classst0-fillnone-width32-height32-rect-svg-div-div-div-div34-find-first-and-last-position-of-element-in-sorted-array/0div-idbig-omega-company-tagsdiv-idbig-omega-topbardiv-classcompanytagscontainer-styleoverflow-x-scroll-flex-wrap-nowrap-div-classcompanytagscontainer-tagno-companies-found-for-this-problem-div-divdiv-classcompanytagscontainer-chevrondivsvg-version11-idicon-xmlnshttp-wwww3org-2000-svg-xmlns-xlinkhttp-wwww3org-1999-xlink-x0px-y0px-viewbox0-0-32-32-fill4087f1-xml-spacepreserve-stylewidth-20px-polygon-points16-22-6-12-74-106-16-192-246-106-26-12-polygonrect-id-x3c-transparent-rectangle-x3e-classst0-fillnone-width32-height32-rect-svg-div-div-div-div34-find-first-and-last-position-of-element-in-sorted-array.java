class Solution {
    public int[] searchRange(int[] arr,int x) {
        int n=arr.length;
        int ans[]=new int[2];
        int start=0;
        int end=n-1;
        int mid=(start+end)/2;
        int lb=-1;
        
        while(start<=end){
         mid=(start+end)/2;
         if(arr[mid]>=x){
             if(arr[mid]==x)
             lb=mid;
             end=mid-1;
         }else start=mid+1;
         
        }
        ans[0]=lb;
        
        int ub=-1;
           start=0;
        end=n-1;
        mid=(start+end)/2;
        
        while(start<=end){
         mid=(start+end)/2;
         if(arr[mid]<=x){
             if(arr[mid]==x)
             ub=mid;
           start=mid+1;
         }else   end=mid-1;
         
        }
        ans[1]=ub;
        
        return ans;
    }
}