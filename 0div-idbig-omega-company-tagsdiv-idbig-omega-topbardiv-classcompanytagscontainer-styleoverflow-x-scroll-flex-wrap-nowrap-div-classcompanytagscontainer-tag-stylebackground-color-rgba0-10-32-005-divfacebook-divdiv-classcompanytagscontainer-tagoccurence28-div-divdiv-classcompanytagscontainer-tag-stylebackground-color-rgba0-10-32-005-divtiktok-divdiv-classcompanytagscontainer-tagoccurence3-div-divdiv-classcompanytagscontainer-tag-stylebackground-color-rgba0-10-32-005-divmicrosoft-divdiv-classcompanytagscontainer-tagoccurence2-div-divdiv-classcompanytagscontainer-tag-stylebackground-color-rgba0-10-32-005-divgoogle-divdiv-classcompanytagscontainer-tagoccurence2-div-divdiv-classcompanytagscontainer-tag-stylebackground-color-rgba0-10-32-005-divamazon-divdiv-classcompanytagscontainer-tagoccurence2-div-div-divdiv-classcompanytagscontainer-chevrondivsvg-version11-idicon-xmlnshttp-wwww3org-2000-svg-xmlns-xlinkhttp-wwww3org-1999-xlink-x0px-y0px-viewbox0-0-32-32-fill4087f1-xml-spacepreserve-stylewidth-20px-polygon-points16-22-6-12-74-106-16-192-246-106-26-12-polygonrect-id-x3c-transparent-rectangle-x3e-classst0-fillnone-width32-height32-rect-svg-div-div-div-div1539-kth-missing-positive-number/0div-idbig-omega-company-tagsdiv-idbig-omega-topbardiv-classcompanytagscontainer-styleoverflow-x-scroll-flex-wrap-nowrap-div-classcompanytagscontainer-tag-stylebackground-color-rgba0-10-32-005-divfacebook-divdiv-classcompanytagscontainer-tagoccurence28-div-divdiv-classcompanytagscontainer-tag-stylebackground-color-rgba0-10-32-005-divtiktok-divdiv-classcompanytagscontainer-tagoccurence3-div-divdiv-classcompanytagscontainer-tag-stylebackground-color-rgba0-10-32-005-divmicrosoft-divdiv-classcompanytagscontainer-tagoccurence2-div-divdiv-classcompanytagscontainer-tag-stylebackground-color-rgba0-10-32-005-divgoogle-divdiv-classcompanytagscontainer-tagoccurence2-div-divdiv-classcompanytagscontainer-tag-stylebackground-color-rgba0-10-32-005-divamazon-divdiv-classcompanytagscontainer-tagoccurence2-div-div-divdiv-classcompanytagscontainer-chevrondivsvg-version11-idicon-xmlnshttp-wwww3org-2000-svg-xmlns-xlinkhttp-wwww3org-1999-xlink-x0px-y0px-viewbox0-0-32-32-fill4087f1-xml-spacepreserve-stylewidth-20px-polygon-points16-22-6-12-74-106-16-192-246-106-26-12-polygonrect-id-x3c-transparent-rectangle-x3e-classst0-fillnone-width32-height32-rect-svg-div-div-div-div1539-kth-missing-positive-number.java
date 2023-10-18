class Solution {
    public int findKthPositive(int[] arr, int k) {
     /*   //brute force approach using O(n) time
        int miss=0;
        int j=0;
        for(int i=1; i<=arr.length+k; i++){
            if(j<arr.length){
            if(i!=arr[j]){
                miss++;
            
                if(miss==k) return i;
                
            }else j++;
                
            }else {
                miss++;
            if(miss==k) return i;

            }
        }
        return -1;
        
        
        */
        
        //optimal approach usong binary search in O(logn) time
        int n= arr.length;
        int low=0;
        int high=n-1;
        int mid=(low+high)/2;
        
        while(low<=high){
            mid=(low+high)/2;
            int missing=arr[mid]-(mid+1);
            
            if(missing<k) low=mid+1;
            else high=mid-1;
                    
         }
    return low+k;
    }
}