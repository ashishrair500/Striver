class Solution {
     static public boolean check(int [] arr,int N,int minweight,int D){
        int sum=0;
        int daycount=0;
        for(int i=0; i<N; i++){
          if(arr[i]+sum<=minweight){
              sum+=arr[i];
          }else{
              sum=arr[i];
              daycount++;
          }  
        }
        daycount++;
        if(daycount<=D) return true;
        else  return false;
    }
    public int shipWithinDays(int[] arr, int D) {
        int N=arr.length;
          int start=Integer.MIN_VALUE;
        int end=0;
        for(int i=0; i<N; i++) {
            start=Math.max(start,arr[i]);
             end=end+arr[i];
        }
    
    
        int mid=(start+end)/2;
        while(start<=end){
            mid=(start+end)/2;
            if(check(arr,N,mid,D)){
                end=mid-1;
            }else start=mid+1;
        }
        return start;
    }
}