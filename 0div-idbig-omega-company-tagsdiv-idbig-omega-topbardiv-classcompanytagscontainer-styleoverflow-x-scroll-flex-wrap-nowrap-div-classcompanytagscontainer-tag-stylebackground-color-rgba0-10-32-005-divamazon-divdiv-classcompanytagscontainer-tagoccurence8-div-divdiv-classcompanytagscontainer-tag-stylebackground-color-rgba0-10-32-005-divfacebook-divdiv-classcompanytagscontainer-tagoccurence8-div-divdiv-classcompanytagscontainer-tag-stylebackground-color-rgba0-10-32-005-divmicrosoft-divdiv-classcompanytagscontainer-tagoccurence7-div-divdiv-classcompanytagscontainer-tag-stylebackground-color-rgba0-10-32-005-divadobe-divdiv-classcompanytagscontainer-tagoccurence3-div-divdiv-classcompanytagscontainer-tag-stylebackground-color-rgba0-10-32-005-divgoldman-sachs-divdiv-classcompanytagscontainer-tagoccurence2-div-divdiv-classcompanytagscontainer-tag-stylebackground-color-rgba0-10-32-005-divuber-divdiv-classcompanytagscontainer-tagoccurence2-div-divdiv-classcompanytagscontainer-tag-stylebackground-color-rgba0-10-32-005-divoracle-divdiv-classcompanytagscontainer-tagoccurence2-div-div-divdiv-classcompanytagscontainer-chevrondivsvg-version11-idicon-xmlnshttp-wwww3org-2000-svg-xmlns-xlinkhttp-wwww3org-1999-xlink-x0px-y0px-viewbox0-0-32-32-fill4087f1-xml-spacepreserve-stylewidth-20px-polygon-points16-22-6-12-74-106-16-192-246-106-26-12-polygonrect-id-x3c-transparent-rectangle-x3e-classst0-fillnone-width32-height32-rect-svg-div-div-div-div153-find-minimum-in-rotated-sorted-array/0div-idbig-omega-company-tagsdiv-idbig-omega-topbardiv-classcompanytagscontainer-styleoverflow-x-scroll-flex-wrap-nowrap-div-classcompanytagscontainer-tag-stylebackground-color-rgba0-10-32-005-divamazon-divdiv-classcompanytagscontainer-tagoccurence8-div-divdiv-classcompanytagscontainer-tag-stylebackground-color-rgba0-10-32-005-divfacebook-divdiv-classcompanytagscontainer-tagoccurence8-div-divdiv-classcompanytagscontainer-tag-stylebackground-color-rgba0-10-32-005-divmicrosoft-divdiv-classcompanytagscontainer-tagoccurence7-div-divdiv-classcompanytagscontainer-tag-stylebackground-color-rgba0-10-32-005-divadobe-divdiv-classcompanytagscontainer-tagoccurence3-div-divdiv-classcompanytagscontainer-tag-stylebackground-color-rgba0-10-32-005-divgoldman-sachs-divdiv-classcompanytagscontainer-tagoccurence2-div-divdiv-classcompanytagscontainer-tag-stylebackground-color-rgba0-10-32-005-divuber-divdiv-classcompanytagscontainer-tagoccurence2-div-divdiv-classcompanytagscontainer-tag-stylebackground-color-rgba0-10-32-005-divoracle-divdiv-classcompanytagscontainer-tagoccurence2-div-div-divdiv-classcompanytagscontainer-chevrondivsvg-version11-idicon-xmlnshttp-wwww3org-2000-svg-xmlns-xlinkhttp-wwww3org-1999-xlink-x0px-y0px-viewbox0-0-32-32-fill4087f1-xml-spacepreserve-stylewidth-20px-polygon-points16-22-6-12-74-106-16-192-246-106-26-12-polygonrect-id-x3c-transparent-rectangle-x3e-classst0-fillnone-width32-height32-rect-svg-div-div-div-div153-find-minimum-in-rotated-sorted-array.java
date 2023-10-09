class Solution {
    public int findMin(int[] nums) {
        
        //optimal solution by me in n(log) time;
        
        int start=0;
        
        int end=nums.length-1;
        
        int mid=(start+end)/2;
        
        int min=nums[0];
        
        while(start<=end){
            
              mid=(start+end)/2;
            
            if(nums[start]<min)
            min=nums[start];
          
            
            if(nums[mid]<nums[start]) min=nums[mid];
            
            if(nums[mid]>nums[end]) start=mid+1;
            else  end=mid-1;
            
            
        }
        return min;
    }
}