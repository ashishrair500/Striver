class Solution {
    public String getEncryptedString(String s, int k) {
         k=k % s.length();
        StringBuilder sb = new StringBuilder();
        int start=k;
        for(int i=start; i<s.length(); i++){
            sb.append(s.charAt(i));
        }
        
         for(int i=0; i<start; i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}