class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int arr []= new int[nums.length];
        int j=0;
        for(int i=n-k; i<n; i++){
            arr[j]=nums[i];
            j++;
        }
        
        for(int i=0; i<n-k; i++){
            arr[j]=nums[i];
            j++;
        }
         for(int i=0; i<n; i++){
            nums[i]=arr[i];
        }
    }
}