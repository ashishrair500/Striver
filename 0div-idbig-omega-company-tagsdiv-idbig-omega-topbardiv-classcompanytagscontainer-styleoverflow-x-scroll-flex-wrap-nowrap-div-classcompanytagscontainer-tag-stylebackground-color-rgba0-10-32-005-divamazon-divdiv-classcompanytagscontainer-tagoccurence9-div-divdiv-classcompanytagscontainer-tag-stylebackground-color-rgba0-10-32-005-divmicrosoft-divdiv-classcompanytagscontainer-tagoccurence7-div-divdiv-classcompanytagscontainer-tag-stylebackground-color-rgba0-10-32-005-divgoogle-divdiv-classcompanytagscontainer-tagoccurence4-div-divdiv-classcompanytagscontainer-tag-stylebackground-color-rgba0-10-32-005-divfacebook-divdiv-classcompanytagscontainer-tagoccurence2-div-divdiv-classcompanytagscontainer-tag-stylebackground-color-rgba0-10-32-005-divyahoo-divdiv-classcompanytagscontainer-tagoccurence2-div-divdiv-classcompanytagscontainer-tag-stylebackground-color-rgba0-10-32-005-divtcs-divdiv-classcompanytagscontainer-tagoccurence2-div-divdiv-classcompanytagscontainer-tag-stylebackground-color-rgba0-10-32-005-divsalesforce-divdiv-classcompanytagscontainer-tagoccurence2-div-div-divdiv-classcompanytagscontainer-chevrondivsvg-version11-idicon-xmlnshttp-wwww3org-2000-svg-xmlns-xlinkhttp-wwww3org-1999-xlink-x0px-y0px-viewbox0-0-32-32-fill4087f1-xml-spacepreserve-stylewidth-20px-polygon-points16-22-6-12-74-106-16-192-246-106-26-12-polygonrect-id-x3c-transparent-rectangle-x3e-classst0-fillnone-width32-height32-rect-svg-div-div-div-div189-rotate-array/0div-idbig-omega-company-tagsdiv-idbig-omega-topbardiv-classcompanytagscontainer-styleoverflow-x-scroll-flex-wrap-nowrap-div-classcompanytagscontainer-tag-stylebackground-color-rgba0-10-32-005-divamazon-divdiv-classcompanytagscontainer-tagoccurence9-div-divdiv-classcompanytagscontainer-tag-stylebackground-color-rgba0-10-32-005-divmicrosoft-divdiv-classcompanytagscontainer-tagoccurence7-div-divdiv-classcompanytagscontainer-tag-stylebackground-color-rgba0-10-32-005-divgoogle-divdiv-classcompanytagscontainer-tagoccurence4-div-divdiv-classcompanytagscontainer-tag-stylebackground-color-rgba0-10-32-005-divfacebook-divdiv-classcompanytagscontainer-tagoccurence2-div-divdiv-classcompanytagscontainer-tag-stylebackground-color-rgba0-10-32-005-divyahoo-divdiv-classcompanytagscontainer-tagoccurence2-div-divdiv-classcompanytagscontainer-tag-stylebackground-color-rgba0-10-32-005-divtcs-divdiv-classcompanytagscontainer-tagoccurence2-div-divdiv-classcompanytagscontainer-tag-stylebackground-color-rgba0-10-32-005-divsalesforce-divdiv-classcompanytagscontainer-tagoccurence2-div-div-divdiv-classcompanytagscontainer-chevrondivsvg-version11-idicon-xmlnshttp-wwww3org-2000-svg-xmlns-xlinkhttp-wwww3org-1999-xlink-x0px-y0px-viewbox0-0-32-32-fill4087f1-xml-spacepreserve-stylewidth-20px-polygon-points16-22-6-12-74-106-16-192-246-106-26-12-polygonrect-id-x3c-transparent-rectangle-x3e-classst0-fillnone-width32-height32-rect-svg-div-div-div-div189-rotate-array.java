class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int arr []= new int[n];
        
        int j=0;
        for(int i=n-(k%n); i<=n-1; i++){
            
            arr[j]=nums[i];
            j++;
        }
        
                for(int i=0; i<=n-(k%n)-1; i++){
                arr[j]=nums[i];
                    j++;
                
                }
        
                for(int i=0; i<n; i++){
                nums[i]=arr[i];
                
                }
        
    }
}