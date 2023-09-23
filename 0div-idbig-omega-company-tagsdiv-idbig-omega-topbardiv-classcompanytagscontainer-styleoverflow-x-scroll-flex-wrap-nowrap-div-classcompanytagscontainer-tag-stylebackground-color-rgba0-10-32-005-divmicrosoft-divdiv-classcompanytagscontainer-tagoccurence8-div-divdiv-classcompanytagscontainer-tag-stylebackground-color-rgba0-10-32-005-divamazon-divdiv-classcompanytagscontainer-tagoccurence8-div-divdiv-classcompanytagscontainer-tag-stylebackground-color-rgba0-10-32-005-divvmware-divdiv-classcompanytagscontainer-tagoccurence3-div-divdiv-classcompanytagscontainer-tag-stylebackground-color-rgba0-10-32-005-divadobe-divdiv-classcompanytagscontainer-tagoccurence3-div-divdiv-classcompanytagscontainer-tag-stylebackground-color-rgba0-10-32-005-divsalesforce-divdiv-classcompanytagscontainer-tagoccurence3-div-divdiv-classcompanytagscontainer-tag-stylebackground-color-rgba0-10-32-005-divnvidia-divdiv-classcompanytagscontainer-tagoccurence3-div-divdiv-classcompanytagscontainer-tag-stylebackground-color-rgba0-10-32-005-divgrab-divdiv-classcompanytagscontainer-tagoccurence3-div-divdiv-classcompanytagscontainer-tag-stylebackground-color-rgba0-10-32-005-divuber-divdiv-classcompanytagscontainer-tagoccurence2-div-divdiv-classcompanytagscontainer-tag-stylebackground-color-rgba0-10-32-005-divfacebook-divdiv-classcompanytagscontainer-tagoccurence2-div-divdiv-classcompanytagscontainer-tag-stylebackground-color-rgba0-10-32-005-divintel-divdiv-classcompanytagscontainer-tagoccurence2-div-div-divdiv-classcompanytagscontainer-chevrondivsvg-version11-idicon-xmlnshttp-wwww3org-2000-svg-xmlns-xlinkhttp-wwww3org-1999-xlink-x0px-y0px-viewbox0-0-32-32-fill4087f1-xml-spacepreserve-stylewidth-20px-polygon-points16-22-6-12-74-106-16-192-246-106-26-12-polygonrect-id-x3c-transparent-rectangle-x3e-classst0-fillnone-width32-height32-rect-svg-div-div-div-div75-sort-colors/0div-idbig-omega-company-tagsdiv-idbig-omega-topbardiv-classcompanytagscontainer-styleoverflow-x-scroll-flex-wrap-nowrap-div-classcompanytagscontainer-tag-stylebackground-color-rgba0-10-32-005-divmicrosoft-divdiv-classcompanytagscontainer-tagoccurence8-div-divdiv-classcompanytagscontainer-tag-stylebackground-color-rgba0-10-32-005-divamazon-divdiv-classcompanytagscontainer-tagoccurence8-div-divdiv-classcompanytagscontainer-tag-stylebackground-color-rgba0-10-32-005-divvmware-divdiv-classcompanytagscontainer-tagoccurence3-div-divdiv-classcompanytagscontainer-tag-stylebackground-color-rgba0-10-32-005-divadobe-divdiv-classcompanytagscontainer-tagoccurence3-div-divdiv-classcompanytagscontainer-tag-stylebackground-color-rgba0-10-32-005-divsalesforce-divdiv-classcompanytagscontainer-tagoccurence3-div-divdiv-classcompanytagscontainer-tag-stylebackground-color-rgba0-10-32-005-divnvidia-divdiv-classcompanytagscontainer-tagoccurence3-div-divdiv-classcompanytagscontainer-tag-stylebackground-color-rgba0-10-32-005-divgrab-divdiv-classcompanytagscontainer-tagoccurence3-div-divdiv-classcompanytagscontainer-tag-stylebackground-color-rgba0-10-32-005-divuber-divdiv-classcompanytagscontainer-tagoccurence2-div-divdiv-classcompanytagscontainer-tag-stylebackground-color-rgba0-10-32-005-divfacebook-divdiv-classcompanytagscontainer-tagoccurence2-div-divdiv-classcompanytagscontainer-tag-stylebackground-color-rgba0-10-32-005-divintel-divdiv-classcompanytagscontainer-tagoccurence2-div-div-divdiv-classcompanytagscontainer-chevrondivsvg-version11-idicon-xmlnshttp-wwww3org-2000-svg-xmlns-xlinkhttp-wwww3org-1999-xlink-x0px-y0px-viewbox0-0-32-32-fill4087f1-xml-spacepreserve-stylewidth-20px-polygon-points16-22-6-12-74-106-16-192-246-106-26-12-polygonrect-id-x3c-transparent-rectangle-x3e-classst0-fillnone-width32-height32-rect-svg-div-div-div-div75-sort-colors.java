class Solution {
    public void sortColors(int[] nums) {
     int index=0;
        int n=nums.length;
        for(int i=1; i<n; i++){
            if(nums[index]==2 && nums[i]!=2){
                
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index++;
            
            }else if(nums[index]!=2){
                index++;
                
            }
        }
        
        index=nums.length-1;
        for(int i=index-1; i>=0; i--){
            if(nums[index]==0&&nums[i]!=0)
            {
            
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index--;
            
            }else if(nums[index]!=0){
                index--;
                
            }
            
            
        }
        
            
        }
        
        
}