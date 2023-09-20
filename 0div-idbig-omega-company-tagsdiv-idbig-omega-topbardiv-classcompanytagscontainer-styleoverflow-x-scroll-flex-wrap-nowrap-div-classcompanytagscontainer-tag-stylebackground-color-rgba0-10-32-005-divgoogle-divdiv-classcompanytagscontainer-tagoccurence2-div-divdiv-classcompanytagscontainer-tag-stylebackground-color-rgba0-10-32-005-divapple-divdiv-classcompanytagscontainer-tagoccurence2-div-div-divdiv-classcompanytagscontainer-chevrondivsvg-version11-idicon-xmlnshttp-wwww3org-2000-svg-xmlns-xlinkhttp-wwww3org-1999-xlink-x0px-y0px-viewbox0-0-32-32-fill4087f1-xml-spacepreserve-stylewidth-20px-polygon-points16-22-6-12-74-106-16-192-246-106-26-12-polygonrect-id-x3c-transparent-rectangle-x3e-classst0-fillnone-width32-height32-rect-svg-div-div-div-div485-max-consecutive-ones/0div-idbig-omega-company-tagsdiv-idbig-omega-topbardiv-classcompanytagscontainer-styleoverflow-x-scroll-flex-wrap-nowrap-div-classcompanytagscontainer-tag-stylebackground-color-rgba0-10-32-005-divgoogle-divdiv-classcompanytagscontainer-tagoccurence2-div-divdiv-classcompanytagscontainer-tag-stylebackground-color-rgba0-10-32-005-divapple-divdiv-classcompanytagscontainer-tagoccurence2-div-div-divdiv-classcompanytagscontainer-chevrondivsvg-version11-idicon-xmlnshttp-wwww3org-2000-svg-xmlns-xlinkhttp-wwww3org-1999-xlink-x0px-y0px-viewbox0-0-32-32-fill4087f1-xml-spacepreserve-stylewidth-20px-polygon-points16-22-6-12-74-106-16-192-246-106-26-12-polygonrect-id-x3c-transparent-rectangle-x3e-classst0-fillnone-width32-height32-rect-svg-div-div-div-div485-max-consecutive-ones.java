class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
      int countInitial=0;
      int countFinal=0;
        for(int i=0; i<nums.length; i++){
            
            if(nums[i]==1){
                countInitial++;
            }else{
                if(countInitial>countFinal){
                countFinal=countInitial;
                 
                    
                    }     
                   countInitial=0;
            }
            
        }
        
         if(countInitial>countFinal){
                countFinal=countInitial;
         }
        return countFinal;
        
    }
}