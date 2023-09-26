class Solution {
    public int[] rearrangeArray(int[] nums) {
     //   int posv=new int[n/2];
       // int negv=new int[n/2];
        
        //optimal approach 
        int n=1;
        int p=0;
        
        int ans[]=new int[nums.length];
        
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=0){
               ans[p]=nums[i];
                p=p+2;
               
            }else{
                ans[n]=nums[i];
                n=n+2;
            }
            
        }
        return ans;
        

    }
}