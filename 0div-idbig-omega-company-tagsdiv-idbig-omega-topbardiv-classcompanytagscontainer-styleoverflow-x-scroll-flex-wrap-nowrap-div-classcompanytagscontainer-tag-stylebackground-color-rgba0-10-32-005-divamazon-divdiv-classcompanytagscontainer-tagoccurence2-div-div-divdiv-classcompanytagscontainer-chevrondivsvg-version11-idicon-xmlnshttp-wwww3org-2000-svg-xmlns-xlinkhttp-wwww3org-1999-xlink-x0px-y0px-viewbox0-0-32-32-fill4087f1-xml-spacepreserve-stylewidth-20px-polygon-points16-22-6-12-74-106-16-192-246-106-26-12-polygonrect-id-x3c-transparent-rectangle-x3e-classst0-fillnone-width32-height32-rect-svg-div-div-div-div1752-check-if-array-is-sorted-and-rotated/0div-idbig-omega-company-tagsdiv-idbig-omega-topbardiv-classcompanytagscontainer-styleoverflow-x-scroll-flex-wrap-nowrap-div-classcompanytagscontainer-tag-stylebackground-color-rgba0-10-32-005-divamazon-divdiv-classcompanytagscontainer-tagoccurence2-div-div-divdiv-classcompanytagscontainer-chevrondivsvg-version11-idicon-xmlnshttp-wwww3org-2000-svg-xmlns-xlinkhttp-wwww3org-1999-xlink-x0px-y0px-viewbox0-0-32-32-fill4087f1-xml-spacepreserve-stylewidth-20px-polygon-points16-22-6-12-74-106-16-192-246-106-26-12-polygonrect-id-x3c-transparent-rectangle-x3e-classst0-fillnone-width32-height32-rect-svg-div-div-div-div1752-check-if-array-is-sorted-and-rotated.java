class Solution {
    public boolean check(int[] nums) {
        int min=Integer.MAX_VALUE;
        int minIndex=0;
        int count=0;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i-1]>nums[i])
                count++;
            
            
        }
        if(nums[0]<nums[nums.length-1])
                count++;
        
        return count<=1;
        
     
        /*
        //this is left side loop
        if(minIndex>0 && nums[0]<nums[nums.length-1]) return false;
        
                for(int i=0; i<minIndex-1; i++)
                {
                    
 if(nums[i]>nums[i+1])     return false;              
                  //  if(nums[0]<nums[nums.length-1]) return false;
                }
        
         for(int i=minIndex; i<nums.length-1; i++)
                {
                    
 if(nums[i]>nums[i+1])     return false;              
                    
                }
        
        
        return true;*/
        
        
        
    }
}