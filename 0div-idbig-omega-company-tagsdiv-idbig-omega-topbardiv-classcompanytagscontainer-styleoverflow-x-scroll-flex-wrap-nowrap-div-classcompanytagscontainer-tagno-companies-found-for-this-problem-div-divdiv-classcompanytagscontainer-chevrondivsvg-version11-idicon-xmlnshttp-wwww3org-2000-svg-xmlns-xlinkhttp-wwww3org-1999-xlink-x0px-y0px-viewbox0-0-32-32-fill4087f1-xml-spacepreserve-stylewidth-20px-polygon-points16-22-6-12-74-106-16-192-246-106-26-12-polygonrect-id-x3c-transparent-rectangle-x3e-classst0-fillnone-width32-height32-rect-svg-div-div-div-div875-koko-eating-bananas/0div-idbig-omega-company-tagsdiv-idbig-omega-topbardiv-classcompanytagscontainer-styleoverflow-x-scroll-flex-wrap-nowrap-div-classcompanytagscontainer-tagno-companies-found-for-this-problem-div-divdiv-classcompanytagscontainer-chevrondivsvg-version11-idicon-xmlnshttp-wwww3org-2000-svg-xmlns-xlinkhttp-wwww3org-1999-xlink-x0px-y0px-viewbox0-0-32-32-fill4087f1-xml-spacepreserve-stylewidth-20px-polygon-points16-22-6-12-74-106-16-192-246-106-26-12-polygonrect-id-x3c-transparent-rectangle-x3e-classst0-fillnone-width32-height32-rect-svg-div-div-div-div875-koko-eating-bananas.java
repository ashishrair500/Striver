class Solution {
    public int minEatingSpeed(int[] piles, int h) {
          
        //optimal solution total time taken in O(log(piles[max])^n) by me
        
           int max=Integer.MIN_VALUE;
        
        //to find max element
        
        for(int i=0; i<piles.length; i++){
            max=Math.max(max,piles[i]);
        }
        
        
        
        int start=1;
        int end=max;
        int mid=(start+end)/2;
        int checkHour=0;
        int rem=0;
        
        while(start<=end){
             mid=(start+end)/2;
             checkHour=0;
           
            for(int i=0; i<piles.length; i++){
                rem=(int)Math.ceil((double)piles[i]/(double)mid);
                checkHour+=rem;
                if(checkHour>h){
                    start=mid+1;
                    break;
                }
                
            }
            
         //   if(checkHour==h) return mid;
            if(checkHour<=h) end=mid-1;
            
        }
        
        return start;
        
        
            }
}