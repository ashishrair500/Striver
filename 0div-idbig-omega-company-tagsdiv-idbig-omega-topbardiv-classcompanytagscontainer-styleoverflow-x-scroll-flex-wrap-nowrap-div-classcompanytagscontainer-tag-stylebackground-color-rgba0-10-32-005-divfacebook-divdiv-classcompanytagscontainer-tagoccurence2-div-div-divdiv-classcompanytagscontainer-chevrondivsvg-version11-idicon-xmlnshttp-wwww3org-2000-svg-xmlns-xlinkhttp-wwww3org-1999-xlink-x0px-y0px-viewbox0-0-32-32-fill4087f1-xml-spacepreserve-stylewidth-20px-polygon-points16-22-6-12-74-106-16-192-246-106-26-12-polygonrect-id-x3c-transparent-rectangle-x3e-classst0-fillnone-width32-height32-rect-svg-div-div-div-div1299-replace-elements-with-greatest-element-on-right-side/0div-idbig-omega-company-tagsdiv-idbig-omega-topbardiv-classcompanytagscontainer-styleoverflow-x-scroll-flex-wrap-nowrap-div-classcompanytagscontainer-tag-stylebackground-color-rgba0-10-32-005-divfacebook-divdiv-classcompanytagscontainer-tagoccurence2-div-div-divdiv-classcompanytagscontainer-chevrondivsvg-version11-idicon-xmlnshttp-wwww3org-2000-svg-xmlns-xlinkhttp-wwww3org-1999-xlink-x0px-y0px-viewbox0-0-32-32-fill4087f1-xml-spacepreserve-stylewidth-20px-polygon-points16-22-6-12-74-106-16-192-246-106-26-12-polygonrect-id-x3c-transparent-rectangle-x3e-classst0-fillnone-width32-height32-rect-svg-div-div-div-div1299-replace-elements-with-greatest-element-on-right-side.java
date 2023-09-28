class Solution {
    public int[] replaceElements(int[] arr) {
       
        //brute force approach
        int max=Integer.MIN_VALUE;
        int n= arr.length;
         int ans []= new int[n];
        for(int i=0; i<n-1; i++){
            max=Integer.MIN_VALUE;
            for(int j=i+1; j<arr.length; j++){
                if(max<arr[j]) max=arr[j];
                         
                
            }
            ans[i]=max;
            
        }
        ans[n-1]=-1;
        return ans;
    }
}