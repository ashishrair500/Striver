class Solution {
    public boolean rotateString(String s, String goal) {
        String s3=s+s;
        int j=0;
        if(s3.indexOf(goal)==-1) return false;
        if(s.length()!=goal.length()) return false;
        
        return true;
    }
}