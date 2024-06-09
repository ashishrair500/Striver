class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>>ans =new ArrayList<>();
        List<Integer>ds =new ArrayList<>();
        findCombinations(1,n,n,k,ans,ds);
        return ans;
    }
    
    public static void findCombinations(int ind, int n, int target,int k, List < List < Integer >> ans,          List <Integer> ds){
        
           if (ind ==n+1) {
            if (target == 0 && ds.size()==k) {
                ans.add(new ArrayList <>(ds));
            }
            return;
        }

        if (ind <= target && ds.size()<=k && ind<=9) {
            
            ds.add(ind);
            findCombinations(ind+1, n, target - ind,k, ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, n, target,k, ans, ds);
    }
}