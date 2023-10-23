class Solution {
    public String reverseWords(String s) {
        String []str=s.split(" ",-2);
        
        StringBuilder sb = new StringBuilder("");
        String a="";
        for(int i=str.length-1; i>=0; i--){
           
            if(!(str[i].equals(a))){
            sb.append(str[i]);
                        sb.append(" ");
            }
        }
        
        sb.deleteCharAt(sb.length()-1);
        
        return sb.toString();
    }
}