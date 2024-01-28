class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n=arr.length;
        
        Stack <Integer> val= new Stack<>();
        int ans2[]= new int[n-k+1];
         
        int ans []= new int[n]; 
        
        val.push(n-1);
        ans[n-1]=n;

        for(int i=n-2; i>=0; i--){
          while(val.size()>0&&arr[i]>=arr[val.peek()]){
            val.pop();
          }
        if(val.size()==0){
                ans[i]=n;
        }else{
            ans[i]=val.peek();
        }
        val.push(i);
        }
        
        
         
        int j=0;
        for(int i=0; i<n-k+1; i++){
            j=i;
            
            while(ans[j]<i+k){
                j=ans[j];
            }
            ans2[i]=arr[j];
        }
        
        
        
        return ans2;
    }
}