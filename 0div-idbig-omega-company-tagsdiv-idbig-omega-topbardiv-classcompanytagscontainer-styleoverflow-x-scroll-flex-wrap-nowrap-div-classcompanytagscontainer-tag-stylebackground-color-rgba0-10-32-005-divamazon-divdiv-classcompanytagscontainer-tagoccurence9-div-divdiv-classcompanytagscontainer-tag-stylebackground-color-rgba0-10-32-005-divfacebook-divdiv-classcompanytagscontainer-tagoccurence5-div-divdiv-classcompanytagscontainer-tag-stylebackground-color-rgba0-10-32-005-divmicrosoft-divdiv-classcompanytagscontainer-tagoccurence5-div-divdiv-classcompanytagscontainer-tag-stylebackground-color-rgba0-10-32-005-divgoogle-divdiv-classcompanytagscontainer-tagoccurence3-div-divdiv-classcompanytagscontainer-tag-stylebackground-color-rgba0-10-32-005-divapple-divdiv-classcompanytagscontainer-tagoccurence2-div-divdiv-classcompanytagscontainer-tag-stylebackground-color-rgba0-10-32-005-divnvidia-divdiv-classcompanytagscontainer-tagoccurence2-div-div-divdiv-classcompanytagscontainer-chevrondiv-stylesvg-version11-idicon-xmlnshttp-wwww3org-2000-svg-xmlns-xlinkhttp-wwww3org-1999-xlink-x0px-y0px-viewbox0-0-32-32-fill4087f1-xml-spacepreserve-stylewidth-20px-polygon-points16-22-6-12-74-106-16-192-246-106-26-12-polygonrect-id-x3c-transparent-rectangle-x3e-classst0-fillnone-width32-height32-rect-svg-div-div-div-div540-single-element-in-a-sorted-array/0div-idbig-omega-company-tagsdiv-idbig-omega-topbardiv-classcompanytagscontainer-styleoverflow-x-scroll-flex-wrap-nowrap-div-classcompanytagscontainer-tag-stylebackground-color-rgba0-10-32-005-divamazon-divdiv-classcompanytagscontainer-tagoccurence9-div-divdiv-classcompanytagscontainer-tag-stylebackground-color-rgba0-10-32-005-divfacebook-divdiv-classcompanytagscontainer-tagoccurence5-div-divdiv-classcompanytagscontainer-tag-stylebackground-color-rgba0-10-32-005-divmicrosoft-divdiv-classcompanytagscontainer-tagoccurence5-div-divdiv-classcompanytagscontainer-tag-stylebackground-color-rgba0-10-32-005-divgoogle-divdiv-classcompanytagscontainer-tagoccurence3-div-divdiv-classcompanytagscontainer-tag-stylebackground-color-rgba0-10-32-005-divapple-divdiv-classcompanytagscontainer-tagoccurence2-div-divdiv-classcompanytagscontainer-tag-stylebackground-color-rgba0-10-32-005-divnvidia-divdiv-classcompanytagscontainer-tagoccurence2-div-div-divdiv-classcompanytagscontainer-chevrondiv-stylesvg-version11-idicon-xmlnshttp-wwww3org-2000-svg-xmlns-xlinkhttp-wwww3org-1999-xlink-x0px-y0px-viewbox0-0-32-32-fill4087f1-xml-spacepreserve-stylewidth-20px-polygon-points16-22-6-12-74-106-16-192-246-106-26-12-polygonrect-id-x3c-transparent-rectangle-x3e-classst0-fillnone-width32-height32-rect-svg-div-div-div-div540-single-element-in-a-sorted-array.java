class Solution {
    public int singleNonDuplicate(int[] nums) {
        /*
        //not optimal taking O(n)
        for(int i=0; i<nums.length-1; i=i+2){
            if(nums[i]!=nums[i+1]) return nums[i];
            
            
        }return nums[nums.length-1];
    */
        
        //optimal using binary search
        int n=nums.length;
    
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2])return nums[n-1];
        
    int start=0;
        int end=nums.length;
        int mid=(start+end)/2;
        
        while(start<=end){
            mid=(start+end)/2;
            
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
            else{
            if(nums[mid]==nums[mid-1] && (mid-1)%2==0){
                start=mid+1;
            }else if(nums[mid]==nums[mid+1] && (mid+1)%2==1){
                
                start=mid+1;
            }else end=mid-1;
            
        }
           
        }
        return 0;
    }
}