class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
      Set<Integer> ans = new TreeSet<>();
        
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            ans.add(nums[i]);
min=Math.min(min,nums[i]);
        }

        int count = 0;
        int check =min ;
        int anss = Integer.MIN_VALUE;

for (Integer in : ans) {

     if (in == check) {
                count++;
                anss = Math.max(anss, count);
                check++;
            } else {
                check = in;
                count = 1;
                check++;

            }
}

        return anss;
    }
}