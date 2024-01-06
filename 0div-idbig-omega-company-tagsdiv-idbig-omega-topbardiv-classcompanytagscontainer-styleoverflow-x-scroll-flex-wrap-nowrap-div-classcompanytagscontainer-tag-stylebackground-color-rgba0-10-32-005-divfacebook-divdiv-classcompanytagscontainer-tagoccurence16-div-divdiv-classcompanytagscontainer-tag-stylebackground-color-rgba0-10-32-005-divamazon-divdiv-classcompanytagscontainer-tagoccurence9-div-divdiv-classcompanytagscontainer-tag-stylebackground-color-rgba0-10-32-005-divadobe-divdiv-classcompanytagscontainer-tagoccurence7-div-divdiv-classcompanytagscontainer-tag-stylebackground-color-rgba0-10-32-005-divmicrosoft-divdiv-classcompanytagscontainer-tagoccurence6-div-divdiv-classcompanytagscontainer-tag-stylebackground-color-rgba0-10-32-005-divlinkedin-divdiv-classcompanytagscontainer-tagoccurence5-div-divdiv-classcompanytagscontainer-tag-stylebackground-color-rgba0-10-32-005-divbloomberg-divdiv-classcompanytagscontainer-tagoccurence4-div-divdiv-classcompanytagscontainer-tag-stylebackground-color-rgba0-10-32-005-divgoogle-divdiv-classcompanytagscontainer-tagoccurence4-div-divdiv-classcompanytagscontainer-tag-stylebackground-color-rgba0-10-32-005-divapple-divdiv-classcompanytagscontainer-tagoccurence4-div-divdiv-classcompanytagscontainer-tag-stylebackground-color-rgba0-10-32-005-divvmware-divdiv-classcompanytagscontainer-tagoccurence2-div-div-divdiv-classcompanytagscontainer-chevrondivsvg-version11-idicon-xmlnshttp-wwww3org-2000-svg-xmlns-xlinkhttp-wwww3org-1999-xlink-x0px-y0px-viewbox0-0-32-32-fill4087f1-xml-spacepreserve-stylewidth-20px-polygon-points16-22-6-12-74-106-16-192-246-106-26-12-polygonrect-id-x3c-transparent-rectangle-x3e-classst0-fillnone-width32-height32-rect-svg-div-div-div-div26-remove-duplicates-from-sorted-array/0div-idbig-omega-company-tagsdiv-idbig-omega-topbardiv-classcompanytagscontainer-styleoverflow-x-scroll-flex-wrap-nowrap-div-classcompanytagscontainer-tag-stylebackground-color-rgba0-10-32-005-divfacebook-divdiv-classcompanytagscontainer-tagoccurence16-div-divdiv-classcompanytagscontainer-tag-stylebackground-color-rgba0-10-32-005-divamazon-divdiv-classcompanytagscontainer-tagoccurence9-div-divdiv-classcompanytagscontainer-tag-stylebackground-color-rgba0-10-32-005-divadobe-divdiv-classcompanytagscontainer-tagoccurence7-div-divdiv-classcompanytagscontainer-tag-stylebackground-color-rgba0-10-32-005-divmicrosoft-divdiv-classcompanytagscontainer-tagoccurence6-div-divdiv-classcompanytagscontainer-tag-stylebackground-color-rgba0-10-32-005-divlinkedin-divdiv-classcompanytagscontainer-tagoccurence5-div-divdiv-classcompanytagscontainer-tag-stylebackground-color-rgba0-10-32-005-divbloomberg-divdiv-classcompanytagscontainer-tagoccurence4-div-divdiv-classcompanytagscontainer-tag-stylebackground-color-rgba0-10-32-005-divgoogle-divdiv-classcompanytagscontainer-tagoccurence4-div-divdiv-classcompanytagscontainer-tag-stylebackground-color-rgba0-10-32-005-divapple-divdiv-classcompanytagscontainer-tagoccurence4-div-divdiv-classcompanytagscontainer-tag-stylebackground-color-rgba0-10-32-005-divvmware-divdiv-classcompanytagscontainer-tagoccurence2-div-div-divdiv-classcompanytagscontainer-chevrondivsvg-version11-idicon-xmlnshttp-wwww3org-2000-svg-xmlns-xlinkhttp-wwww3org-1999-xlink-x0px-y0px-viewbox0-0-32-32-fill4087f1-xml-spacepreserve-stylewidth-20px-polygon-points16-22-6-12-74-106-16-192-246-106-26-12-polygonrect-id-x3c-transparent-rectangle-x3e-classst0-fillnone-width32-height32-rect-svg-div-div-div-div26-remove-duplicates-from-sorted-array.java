class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int pfirst=0;
        int psecond=1;
        
      while(psecond<nums.length){
            
            if(nums[pfirst]!=nums[psecond]){
                int temp=nums[pfirst+1];
                nums[pfirst+1]=nums[psecond];
                nums[psecond]=temp;
                pfirst++;
                psecond++;
count++;
                
            }else {
                psecond++;
            }
        }
         return count+1;
    }
}