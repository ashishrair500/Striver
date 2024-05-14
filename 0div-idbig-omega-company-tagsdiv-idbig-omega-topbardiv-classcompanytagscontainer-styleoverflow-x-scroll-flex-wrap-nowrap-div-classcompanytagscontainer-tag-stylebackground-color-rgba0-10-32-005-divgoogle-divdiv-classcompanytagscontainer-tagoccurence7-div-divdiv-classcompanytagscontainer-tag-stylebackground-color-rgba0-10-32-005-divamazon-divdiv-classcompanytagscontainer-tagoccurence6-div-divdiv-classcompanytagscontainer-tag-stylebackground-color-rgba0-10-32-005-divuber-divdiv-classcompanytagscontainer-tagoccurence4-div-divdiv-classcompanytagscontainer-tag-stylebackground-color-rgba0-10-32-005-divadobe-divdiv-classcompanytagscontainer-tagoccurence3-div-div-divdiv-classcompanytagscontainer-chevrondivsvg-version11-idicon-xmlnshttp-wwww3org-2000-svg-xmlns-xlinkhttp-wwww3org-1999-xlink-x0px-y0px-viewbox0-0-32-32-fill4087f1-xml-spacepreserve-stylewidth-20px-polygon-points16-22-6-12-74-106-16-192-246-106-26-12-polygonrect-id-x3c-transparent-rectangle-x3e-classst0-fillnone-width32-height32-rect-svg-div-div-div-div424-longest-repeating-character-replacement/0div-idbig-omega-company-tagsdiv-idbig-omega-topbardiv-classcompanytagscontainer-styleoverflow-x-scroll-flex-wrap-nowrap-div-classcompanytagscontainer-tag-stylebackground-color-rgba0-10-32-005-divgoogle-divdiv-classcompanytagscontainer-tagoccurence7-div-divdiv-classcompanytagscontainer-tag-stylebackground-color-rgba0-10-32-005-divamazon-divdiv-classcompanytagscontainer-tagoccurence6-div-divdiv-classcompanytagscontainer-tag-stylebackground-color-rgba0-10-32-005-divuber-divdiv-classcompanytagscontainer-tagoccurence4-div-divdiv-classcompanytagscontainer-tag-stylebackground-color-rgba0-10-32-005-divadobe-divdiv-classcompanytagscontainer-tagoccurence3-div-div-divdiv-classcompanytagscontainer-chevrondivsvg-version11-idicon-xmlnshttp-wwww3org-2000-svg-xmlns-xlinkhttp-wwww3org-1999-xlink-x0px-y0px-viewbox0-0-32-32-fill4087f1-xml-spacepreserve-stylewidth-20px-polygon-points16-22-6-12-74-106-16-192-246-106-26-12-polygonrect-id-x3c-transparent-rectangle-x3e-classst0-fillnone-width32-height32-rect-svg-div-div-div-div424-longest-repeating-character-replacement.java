class Solution {
    public int characterReplacement(String s, int k) {
        int arr[]=new int[26];
        int longest=0;
        int maxfreq=0;
        int start=0;
        int end=0;
        int windowsize=0;
        for(; end<s.length(); end++)
        {
            arr[s.charAt(end)-'A']++;
            maxfreq=Math.max(maxfreq,arr[s.charAt(end)-'A']);
            windowsize=end-start+1;
            if(windowsize-maxfreq>k){
                
                arr[s.charAt(start)-'A']--;
                start++;
            }
            longest=Math.max(longest,end-start+1);
        }        
        
        
        return longest;
            }
}