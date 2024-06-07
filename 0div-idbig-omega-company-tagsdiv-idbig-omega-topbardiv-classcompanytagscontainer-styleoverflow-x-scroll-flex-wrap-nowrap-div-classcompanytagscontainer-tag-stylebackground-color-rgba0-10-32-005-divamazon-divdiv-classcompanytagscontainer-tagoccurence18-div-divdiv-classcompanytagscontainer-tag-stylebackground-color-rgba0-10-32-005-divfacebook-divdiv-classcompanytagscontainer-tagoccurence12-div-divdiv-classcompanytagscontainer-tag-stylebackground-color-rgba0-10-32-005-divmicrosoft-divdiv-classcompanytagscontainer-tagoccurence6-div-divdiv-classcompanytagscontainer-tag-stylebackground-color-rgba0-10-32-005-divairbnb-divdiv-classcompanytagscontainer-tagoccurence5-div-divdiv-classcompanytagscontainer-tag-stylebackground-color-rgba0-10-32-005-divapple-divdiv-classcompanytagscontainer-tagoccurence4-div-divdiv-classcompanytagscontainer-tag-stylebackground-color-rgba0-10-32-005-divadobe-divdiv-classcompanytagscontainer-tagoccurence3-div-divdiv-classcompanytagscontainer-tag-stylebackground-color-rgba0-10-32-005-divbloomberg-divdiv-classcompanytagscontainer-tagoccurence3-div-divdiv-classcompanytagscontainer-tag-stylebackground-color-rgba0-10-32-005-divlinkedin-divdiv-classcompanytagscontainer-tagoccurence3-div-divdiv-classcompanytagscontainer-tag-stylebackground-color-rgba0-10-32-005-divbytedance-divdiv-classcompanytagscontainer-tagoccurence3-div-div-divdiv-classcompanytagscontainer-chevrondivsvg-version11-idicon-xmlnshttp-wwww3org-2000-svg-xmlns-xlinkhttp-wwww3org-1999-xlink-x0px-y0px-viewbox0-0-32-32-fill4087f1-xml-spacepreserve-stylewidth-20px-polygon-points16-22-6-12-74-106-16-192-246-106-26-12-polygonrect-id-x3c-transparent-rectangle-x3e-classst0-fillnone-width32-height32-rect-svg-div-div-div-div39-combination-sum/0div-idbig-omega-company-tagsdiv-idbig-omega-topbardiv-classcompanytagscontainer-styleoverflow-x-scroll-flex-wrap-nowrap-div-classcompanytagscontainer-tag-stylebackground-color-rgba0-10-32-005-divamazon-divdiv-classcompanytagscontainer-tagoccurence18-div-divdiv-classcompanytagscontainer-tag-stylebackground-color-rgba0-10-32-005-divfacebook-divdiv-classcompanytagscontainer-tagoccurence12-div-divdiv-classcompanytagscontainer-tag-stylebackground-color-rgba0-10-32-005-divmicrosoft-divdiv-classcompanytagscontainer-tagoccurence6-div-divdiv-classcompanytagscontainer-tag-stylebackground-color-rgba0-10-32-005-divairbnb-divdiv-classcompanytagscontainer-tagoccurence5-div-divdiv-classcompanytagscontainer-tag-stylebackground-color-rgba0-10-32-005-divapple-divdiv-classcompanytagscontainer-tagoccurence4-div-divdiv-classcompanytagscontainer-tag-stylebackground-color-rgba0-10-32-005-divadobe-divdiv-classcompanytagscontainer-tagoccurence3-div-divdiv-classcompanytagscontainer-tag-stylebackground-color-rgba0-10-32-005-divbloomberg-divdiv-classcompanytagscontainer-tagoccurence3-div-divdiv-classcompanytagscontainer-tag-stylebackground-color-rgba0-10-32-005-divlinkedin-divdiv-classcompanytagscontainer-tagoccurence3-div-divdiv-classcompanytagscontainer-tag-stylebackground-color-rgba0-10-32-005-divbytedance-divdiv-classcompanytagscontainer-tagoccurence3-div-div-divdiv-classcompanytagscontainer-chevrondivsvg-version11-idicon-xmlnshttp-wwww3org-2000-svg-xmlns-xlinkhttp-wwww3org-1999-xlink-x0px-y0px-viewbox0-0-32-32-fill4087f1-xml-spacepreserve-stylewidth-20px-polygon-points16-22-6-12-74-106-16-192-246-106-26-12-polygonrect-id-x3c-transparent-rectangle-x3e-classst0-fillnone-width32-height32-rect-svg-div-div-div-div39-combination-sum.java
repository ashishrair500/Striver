class Solution {
    public List<List<Integer>> combinationSum(int[] a, int s) {
  List<List<Integer>>ans =new ArrayList<>();
        List<Integer>ds =new ArrayList<>();
        findCombinations(0,a,s,ans,ds);
        return ans;
    }
    
    public static void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList < > (ds));
            }
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, arr, target, ans, ds);
    }

}