class Solution {
    public boolean isPalindrome(int x) {
       
        
        int check=x;
     
         if(x<0 ) return false;
        
        int rem=0;
        int num=0;
        while(x>0){
            rem=x%10;
            num=num*10+rem;
            x=x/10;
        }
        
        
        return check==num?true:false;
    }
}