class Solution {
    public int findMin(int[] nums) {
        int min= Integer.MIN_VALUE;
        int low=0;
        int high=nums.length-1;
        int mid=(low+high)/2;
        
        if(nums.length==1) return nums[0];
        if(nums.length==2 && nums[0]<nums[1]) return nums[0];
        else if(nums.length==2 && nums[0]>nums[1]) return nums[1];
        
        while(low<high){
            mid=(low+high)/2;
            
            if(mid>0 && mid<nums.length-1 && nums[mid]<nums[mid-1] && nums[mid]<nums[mid+1])  return nums[mid];
            if(nums[high]<nums[mid]) low=mid+1;
            else high=mid-1;
        }
         mid=(low+high)/2;
         return nums[mid];
    }
}