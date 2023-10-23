class Solution {
    public String largestOddNumber(String num) {
        StringBuilder s= new StringBuilder(num);
        
        
        for(int i=num.length()-1; i>=0; i--){
            
            int j=s.charAt(i)-'0';
            if(j%2==0){
                s.deleteCharAt(i);
            }else {
                break;
            }
            
        }
        return s.toString();
    }
}