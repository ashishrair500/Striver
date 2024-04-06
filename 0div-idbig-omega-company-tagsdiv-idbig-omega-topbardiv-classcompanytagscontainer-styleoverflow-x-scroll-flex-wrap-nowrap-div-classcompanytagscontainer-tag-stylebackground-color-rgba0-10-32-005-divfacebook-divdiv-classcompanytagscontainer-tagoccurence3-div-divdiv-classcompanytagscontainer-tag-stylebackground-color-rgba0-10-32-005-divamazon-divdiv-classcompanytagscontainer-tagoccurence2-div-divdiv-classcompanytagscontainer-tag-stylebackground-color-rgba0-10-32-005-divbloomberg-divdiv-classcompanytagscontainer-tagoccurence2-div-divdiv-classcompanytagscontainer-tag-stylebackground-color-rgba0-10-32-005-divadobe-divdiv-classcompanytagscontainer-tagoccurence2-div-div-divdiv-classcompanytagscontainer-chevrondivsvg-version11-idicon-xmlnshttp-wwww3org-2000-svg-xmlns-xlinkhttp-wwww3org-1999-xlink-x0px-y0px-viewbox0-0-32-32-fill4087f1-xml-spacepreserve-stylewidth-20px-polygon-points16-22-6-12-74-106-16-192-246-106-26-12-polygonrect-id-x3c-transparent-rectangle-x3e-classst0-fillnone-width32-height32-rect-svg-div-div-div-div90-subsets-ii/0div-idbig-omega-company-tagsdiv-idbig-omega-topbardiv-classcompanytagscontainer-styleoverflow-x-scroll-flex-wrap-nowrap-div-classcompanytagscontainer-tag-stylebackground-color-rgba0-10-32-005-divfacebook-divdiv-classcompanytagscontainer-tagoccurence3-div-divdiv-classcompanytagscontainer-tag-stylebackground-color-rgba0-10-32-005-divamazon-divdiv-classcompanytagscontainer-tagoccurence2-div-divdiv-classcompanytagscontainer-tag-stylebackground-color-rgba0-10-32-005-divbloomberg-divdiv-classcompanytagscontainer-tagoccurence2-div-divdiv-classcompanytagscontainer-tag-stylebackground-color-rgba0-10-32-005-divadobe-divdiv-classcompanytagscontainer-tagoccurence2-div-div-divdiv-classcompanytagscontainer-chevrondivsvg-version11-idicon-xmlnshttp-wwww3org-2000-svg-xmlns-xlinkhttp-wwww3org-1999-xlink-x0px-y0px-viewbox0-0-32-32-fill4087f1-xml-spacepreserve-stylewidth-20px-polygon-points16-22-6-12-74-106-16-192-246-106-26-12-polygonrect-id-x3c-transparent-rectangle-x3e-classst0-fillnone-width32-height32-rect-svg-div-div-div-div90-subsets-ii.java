class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
          List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        int n= nums.length;
        for(int i=0; i<(1<<n); i++){
            a=new ArrayList<>();
            for(int j=0; j<n; j++){
                
                if((i&(1<<j))!=0) a.add(nums[j]);
            
            }
            Collections.sort(a);
            if(!ans.contains(a))
            ans.add(a);
        }
        
        return ans;
    }
}