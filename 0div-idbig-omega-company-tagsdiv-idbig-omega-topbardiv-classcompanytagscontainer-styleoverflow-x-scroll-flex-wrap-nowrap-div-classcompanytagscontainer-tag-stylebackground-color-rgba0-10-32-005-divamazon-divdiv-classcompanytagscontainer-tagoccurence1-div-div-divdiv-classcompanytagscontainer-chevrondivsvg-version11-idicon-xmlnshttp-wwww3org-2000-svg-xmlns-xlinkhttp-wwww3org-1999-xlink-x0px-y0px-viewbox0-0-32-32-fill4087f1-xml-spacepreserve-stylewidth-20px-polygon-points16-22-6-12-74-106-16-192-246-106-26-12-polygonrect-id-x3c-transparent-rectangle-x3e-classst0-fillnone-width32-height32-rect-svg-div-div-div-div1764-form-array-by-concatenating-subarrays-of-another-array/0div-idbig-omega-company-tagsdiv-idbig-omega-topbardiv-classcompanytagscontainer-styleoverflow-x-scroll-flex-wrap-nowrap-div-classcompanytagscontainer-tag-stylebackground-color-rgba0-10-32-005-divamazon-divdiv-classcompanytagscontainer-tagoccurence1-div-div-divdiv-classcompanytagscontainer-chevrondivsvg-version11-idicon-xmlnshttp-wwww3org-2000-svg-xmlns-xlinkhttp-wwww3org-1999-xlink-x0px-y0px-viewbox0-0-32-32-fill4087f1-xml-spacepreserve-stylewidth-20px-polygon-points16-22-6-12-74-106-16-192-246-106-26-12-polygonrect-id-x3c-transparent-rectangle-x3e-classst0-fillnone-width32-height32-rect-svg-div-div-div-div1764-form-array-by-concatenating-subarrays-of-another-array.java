class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
        int n=groups.length;
        int ncol=groups[0].length;
        int row=0;
        
        for(int i=0;i<nums.length;i++)
        {
            int j=i;
            int col=0;
            
            while(col<groups[row].length && j<nums.length && groups[row][col]==nums[j])
            {
                col++;
                j++;
            }
            
            if(col==groups[row].length)
            {
                row++;
                i=j-1;
            }
            
            if(row==groups.length)
            {
                return true;
            }
        }
        return false;
    }
}