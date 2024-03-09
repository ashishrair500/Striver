class Solution {
    public String removeDigit(String number, char digit) {
        
        StringBuilder sb =new StringBuilder(number);
        int index=-1;
        for (int i=0; i<number.length()-1; i++){
            if(sb.charAt(i)==digit && sb.charAt(i+1)>digit){
                sb.deleteCharAt(i);
                index=-1;
                break;
            }
           else if(sb.charAt(i)==digit && sb.charAt(i+1)!=digit) index=i;
        }
        
        
        if(index==-1 && sb.length()==number.length()) sb.deleteCharAt(sb.length()-1);
        if(index!=-1 && number.charAt(number.length()-1)==digit) sb.deleteCharAt(sb.length()-1);
                if(index!=-1 && number.charAt(number.length()-1)!=digit) sb.deleteCharAt(index);

        return sb.toString();
    }
}