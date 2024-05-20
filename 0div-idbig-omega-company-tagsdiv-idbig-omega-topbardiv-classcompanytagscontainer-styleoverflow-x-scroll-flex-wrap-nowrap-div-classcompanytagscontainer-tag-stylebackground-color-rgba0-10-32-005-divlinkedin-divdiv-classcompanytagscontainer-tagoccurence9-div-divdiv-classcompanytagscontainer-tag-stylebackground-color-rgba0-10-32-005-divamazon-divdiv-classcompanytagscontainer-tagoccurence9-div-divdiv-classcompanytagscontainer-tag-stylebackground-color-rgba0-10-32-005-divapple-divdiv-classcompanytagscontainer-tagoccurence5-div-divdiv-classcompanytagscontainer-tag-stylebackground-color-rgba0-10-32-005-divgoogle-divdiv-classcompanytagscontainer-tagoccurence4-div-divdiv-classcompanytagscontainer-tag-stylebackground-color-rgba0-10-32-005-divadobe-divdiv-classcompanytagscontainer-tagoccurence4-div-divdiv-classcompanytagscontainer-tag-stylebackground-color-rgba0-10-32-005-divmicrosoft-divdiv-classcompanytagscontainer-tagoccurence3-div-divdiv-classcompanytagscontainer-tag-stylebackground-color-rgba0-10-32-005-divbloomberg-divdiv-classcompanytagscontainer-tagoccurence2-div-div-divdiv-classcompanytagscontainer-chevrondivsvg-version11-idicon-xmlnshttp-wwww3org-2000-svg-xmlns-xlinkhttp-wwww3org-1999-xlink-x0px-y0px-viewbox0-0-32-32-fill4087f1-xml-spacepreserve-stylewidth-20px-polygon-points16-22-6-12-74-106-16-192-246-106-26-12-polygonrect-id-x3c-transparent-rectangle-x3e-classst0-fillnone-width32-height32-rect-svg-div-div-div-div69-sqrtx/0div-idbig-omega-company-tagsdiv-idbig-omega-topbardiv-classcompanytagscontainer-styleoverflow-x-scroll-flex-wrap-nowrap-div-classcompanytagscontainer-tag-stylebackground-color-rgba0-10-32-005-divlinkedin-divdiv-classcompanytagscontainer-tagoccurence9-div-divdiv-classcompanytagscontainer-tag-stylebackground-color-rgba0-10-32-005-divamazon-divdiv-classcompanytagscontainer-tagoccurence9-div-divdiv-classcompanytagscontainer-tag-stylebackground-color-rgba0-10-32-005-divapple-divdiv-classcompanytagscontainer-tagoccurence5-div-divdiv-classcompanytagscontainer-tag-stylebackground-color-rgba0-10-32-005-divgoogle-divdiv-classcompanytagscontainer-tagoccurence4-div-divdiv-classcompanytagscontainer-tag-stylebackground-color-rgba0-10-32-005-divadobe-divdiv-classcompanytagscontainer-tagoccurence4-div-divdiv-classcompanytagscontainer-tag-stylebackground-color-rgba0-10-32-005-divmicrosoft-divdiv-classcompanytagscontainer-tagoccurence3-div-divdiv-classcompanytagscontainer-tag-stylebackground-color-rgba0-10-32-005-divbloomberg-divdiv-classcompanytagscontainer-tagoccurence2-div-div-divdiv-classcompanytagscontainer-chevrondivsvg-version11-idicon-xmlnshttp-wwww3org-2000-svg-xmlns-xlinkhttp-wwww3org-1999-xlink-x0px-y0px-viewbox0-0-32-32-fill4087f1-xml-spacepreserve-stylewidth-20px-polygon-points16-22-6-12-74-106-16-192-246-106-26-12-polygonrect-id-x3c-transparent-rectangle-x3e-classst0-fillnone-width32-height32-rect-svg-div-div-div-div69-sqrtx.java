class Solution {
    public int mySqrt(int a) {
     
        long x=(long)a;
         if(x==0) return 0;
         long ans=1;
	     long low=1;
	     long high=x;
	     long mid =(low+high)/2;
	     while(low<=high){
	         mid=(low+high)/2;
	         if(mid*mid>x)high=mid-1;
	         else if (mid*mid<x){
	             ans=mid;
	             low=mid+1;
	         }else {ans= mid; break;}
	     }
	     return (int)ans;
    }
}