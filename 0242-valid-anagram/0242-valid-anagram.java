class Solution {
    public boolean isAnagram(String s, String t) {
        char ch1[]=s.toCharArray();
        char ch []=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch);
        return Arrays.equals(ch1,ch);
    }
}