class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        
        // not optimal using extra space
        /*
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
        */
        
        
        
        int modK=k%n;
        
        
    reverse(nums,0,n-1);    
    reverse(nums,0,modK-1);    
    reverse(nums,modK,n-1);    

        
        
    }
    
    
    
    void reverse(int arr[],int start,int end){
        
       while(start<end){
           
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
            
            
        }
        
        
        
    }
    
    
    
    
    
}