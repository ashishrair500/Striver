class Solution {
    public int countHomogenous(String s) {
        long ans=0;
        int count=1;
        int MOD=1000000007;
        if(s.length()==1) return 1;
        
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1)!=s.charAt(i)){
                ans = (ans + (long)count * (count + 1) / 2) % MOD;
                count=1;
            }else count++;
        }
         ans = (ans + (long)count * (count + 1) / 2) % MOD;
     //   ans=ans % (long)(Math.pow(10,9)+7);
        return (int)ans % (int)(Math.pow(10,9)+7);
    }
}