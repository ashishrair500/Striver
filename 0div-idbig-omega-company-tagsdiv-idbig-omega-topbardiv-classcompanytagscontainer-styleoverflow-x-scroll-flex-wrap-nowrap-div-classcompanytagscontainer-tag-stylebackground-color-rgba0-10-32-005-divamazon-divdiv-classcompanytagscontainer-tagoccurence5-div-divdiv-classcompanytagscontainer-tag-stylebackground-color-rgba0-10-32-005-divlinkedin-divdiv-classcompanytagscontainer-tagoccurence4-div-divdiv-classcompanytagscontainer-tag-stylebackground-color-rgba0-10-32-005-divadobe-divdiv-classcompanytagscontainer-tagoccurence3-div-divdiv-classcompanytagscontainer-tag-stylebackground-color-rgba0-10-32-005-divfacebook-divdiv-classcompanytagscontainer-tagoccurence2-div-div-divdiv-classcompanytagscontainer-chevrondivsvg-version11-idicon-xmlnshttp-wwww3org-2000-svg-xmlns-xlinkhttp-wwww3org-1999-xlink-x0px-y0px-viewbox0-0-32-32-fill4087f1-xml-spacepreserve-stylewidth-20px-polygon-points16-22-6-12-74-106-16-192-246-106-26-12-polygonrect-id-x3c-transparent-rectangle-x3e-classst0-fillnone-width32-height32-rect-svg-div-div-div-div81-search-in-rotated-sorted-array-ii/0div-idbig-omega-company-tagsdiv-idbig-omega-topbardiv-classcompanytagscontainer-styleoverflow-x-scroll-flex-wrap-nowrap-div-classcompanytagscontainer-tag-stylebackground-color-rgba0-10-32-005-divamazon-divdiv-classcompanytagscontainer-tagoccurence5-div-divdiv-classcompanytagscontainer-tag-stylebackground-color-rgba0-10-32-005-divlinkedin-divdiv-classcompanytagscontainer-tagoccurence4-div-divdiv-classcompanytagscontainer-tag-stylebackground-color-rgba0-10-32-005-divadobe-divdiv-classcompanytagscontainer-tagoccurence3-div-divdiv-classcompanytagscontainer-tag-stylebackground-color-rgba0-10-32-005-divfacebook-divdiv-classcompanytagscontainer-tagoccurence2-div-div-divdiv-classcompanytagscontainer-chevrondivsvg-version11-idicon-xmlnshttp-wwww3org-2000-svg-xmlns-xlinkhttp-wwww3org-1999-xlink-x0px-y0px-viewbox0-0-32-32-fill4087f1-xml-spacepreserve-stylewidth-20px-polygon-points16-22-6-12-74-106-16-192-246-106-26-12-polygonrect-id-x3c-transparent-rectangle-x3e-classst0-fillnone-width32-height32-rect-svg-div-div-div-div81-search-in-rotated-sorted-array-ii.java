class Solution {
    public boolean search(int[] nums, int target) {
     
         int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] <=target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
        
        /* int start = 0;
      int end = nums.length - 1;
   // boolean flag=false;
    while (start <= end) {
        int mid = start + (end - start) / 2; 
        
        // Calculate mid without potential overflow
        
        if (nums[mid] == target) {
           return true;
        } 
        
        if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start = start + 1;
                end = mid - 1;
                continue;
            }

        if (nums[start] <= nums[mid]) {
            // Left half is sorted
            if (nums[start] <= target && target <=nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else {
            // Right half is sorted
            if (nums[mid] <=target && target <= nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
    
    return false;
   */
    }
}