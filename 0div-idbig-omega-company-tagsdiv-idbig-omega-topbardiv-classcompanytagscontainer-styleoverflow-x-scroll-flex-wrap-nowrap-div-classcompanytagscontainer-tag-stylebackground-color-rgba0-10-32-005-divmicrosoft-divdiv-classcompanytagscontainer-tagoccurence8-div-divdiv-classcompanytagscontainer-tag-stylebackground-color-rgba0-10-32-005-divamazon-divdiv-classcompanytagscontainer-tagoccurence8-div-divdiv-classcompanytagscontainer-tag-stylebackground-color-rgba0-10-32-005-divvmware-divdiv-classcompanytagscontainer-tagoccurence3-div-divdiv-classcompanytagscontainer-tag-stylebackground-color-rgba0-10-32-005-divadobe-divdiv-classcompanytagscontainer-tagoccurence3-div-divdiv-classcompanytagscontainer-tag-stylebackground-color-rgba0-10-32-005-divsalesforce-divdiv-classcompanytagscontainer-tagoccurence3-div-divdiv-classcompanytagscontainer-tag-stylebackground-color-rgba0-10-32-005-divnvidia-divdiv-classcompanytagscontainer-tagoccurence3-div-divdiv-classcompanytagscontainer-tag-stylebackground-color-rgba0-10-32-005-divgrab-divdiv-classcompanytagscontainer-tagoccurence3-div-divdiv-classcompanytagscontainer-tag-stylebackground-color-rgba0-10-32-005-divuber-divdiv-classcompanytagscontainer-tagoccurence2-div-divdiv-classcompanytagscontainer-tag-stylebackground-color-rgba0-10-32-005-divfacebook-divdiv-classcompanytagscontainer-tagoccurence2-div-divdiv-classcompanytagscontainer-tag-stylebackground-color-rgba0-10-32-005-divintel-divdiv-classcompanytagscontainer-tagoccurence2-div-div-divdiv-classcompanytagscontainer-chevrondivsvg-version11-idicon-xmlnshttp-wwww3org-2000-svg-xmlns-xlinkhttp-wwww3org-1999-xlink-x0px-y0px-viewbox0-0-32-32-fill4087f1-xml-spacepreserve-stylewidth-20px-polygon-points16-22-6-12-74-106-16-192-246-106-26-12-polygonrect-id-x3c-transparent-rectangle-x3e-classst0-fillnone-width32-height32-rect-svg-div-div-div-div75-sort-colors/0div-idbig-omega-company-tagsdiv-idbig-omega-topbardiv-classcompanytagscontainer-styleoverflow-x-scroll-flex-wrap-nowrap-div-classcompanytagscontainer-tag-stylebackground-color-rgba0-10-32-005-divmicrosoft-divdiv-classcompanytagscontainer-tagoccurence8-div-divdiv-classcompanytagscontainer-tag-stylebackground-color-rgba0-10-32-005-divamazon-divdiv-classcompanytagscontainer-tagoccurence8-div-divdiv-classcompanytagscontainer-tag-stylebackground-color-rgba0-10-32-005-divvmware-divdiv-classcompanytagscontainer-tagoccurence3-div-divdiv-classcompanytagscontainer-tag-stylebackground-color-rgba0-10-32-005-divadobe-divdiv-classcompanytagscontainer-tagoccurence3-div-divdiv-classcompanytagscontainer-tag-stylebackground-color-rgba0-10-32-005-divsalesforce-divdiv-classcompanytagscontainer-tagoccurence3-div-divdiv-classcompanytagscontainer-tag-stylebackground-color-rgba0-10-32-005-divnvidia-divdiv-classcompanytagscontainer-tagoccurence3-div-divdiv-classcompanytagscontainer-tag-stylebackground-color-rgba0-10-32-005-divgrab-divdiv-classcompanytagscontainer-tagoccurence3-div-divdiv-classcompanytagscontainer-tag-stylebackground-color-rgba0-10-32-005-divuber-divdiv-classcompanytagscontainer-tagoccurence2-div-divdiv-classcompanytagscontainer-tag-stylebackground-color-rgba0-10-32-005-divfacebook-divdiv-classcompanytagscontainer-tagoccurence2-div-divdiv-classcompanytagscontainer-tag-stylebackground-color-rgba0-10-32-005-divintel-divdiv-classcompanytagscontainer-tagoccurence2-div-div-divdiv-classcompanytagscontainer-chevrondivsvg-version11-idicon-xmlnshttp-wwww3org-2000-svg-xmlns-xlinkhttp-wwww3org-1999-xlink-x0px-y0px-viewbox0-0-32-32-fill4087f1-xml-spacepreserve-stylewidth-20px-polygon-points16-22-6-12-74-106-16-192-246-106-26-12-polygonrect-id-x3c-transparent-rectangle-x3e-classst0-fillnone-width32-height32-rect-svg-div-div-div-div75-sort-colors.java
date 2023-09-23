class Solution {
    public void sortColors(int[] nums) {
        
  /*  this approach take O(2n) time 
        int n=nums.length;
        for(int i=1; i<n; i++){
            if(nums[index]==2 && nums[i]!=2){
                
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index++;
            
            }else if(nums[index]!=2){
                index++;
                
            }
        }
        
        index=nums.length-1;
        for(int i=index-1; i>=0; i--){
            if(nums[index]==0&&nums[i]!=0)
            {
            
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index--;
            
            }else if(nums[index]!=0){
                index--;
                
            }
            
            
        }
        
            
        }
        
    */
            // this is the better approach using dutch nAatioanl flag algorithm DNF algo
    int n=nums.length;
      int low=0;
        int high=n-1;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==2){swap(nums,high,mid);
                high--;
            }
        }
    }
    
   public static void swap (int arr[],int a,int b){
        
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
        
}