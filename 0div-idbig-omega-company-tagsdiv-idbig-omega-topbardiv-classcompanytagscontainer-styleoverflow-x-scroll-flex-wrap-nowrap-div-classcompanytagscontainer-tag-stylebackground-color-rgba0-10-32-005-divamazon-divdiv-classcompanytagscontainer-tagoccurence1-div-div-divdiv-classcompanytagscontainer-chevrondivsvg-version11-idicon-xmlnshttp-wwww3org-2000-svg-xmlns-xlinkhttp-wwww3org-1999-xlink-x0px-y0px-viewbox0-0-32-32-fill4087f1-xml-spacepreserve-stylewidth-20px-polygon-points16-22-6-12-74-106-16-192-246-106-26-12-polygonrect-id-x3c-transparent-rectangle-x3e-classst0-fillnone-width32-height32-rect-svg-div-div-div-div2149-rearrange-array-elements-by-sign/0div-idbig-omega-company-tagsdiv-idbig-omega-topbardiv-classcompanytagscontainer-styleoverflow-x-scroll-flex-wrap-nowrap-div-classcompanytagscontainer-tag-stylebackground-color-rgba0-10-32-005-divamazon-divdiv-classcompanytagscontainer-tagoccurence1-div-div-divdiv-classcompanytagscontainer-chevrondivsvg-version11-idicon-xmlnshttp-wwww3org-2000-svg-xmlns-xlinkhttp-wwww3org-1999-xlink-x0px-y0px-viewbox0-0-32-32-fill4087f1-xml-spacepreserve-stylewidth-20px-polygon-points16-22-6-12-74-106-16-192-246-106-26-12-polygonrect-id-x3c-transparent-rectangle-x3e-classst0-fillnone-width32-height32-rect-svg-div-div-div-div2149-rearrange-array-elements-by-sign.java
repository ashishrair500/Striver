class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> p= new ArrayList<>();
        List<Integer> n= new ArrayList<>();
        int []ans = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0) n.add(nums[i]);
            else p.add(nums[i]);
        }
        int j=0; 
        int k=0;
          for(int i=0; i<nums.length; i++){
            if(i%2==0){ans[i]=p.get(j); j++;
                      }
              else{
                ans[i]=n.get(k); k++;
            }
        }
        
        
        return ans;
    }
}