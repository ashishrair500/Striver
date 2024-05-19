class Solution {
    public int findPeakElement(int[] nums) {
        //optimal solution using binary search
        
        int start=0;
        int end=nums.length-1;
        int mid=(start+end)/2;
        
        if(nums.length==1) return 0;
        if(nums[end-1]<nums[end]) return end;
        if(nums[0]>nums[1]) return 0;
        
        start=1;
        end=end-1;
        
        while(start<=end){
            mid=(start+end)/2;
            
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]) return mid;
            else if(nums[mid]<nums[mid+1]) start=mid+1;
            else end=mid-1;
        }            
        return -1;
    }
}