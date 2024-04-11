class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int max=Integer.MIN_VALUE;
        int sum=0;
      //  int indexcount=0;
        int zcount=0;
        int start=0;
        for(int i=0; i<nums.length; i++){
           
            if(nums[i]==0) zcount++;
            
             sum++;
            
            if(zcount>k){
                while(zcount>k){
                    sum=sum-1;
                    
                    if(nums[start]==0){
                    zcount--;
                        
                    }
                    start++;
                }
            }
            
           
             max=Math.max(max,sum);
          //  indexcount++;
        }
        return max;
    }
}