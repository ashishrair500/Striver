class Solution {
    
    static public void subset(int index , int nums[],List<Integer>curr, List<List<Integer>>result) {
        if(index==nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        subset(index+1,nums,curr,result);
        curr.remove(curr.size()-1);
        subset(index+1,nums,curr,result);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>curr = new ArrayList<>();
        subset(0,nums,curr,result);
        return result;
        
    }
}