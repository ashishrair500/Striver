class Solution {
    public int reverse(int x) {
    int num=0;
        int sign=1;
        if(x<0)
        {
           x=x*-1;
            sign=-1;
        }
        int rem=0;
        long ans=0;
        while(x>0){
            rem=x%10;
            x=x/10;
            
            ans=ans*10+rem;
        
        }
        
        return ans>=Integer.MAX_VALUE ? 0:(int)ans*sign;
    }
}