class Solution {
    public int maxDepth(String s) {
        int ans =0; 
        int max=Integer.MIN_VALUE;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
            ans++;
        }
        max=Math.max(max,ans);
        
        if(s.charAt(i)==')')
            ans--;
        
        }
        return max;
    }
    
}