class Solution {
    public int secondHighest(String s) {
        int max=-1;
        int secmax=-1;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                if((s.charAt(i)-48)>max){
                    secmax=max;
                    max=s.charAt(i)-48;
                }else if((s.charAt(i)-48)>secmax && (s.charAt(i)-48)!=max){
                    secmax=s.charAt(i)-48;
                }
            }
        }
        
        
        return secmax;
    }
}