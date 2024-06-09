class Solution {
    
    public static void findSum(int ind,int arr [],int n,ArrayList<Integer>ds,List<List<Integer>>ans){
        
            ans.add(new ArrayList<>(ds));
           
        for(int i=ind; i<n; i++){
            if(i>ind  &&arr[i]==arr[i-1]) continue;
        ds.add(arr[i]);
        findSum( i+1,arr,n,ds,ans);
        ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(nums);
        findSum(0,nums,nums.length,new ArrayList<>(),ans);
        return ans;
    }
}     