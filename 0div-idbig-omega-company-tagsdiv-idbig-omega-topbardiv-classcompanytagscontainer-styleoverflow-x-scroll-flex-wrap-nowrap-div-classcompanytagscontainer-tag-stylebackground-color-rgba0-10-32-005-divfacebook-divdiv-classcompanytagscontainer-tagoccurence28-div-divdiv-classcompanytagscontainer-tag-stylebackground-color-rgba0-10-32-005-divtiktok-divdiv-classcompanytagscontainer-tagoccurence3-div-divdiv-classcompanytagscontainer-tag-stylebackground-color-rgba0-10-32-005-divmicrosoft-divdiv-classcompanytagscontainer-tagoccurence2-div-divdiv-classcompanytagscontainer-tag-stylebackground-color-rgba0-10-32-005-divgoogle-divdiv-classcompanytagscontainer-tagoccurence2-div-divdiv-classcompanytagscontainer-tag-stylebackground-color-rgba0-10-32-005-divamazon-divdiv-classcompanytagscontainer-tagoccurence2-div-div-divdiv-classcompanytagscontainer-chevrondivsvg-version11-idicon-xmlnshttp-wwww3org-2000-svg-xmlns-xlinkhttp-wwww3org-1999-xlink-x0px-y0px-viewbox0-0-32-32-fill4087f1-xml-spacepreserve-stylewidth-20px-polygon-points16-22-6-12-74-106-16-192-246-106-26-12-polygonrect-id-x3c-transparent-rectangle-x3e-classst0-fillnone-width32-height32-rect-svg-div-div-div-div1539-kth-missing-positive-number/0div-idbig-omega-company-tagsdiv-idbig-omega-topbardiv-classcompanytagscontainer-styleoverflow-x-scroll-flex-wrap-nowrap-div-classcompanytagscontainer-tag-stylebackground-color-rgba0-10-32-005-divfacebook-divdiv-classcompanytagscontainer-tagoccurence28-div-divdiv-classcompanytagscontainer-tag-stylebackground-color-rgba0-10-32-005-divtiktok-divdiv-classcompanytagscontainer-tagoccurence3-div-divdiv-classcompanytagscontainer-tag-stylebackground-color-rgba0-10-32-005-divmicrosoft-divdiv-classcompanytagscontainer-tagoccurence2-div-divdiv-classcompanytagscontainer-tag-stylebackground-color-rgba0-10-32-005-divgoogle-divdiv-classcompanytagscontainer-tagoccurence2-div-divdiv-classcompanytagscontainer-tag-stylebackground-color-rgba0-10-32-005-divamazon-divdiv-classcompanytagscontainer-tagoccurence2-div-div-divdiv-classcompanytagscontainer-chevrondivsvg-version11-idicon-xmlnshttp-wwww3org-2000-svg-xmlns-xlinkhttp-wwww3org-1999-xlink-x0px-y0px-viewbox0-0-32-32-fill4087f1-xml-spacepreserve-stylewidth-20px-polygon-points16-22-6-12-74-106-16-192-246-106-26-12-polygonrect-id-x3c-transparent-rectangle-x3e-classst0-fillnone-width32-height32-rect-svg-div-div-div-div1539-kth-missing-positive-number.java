class Solution {
    public int findKthPositive(int[] arr, int k) {
        //brute force approach using O(n) time
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
    }
}