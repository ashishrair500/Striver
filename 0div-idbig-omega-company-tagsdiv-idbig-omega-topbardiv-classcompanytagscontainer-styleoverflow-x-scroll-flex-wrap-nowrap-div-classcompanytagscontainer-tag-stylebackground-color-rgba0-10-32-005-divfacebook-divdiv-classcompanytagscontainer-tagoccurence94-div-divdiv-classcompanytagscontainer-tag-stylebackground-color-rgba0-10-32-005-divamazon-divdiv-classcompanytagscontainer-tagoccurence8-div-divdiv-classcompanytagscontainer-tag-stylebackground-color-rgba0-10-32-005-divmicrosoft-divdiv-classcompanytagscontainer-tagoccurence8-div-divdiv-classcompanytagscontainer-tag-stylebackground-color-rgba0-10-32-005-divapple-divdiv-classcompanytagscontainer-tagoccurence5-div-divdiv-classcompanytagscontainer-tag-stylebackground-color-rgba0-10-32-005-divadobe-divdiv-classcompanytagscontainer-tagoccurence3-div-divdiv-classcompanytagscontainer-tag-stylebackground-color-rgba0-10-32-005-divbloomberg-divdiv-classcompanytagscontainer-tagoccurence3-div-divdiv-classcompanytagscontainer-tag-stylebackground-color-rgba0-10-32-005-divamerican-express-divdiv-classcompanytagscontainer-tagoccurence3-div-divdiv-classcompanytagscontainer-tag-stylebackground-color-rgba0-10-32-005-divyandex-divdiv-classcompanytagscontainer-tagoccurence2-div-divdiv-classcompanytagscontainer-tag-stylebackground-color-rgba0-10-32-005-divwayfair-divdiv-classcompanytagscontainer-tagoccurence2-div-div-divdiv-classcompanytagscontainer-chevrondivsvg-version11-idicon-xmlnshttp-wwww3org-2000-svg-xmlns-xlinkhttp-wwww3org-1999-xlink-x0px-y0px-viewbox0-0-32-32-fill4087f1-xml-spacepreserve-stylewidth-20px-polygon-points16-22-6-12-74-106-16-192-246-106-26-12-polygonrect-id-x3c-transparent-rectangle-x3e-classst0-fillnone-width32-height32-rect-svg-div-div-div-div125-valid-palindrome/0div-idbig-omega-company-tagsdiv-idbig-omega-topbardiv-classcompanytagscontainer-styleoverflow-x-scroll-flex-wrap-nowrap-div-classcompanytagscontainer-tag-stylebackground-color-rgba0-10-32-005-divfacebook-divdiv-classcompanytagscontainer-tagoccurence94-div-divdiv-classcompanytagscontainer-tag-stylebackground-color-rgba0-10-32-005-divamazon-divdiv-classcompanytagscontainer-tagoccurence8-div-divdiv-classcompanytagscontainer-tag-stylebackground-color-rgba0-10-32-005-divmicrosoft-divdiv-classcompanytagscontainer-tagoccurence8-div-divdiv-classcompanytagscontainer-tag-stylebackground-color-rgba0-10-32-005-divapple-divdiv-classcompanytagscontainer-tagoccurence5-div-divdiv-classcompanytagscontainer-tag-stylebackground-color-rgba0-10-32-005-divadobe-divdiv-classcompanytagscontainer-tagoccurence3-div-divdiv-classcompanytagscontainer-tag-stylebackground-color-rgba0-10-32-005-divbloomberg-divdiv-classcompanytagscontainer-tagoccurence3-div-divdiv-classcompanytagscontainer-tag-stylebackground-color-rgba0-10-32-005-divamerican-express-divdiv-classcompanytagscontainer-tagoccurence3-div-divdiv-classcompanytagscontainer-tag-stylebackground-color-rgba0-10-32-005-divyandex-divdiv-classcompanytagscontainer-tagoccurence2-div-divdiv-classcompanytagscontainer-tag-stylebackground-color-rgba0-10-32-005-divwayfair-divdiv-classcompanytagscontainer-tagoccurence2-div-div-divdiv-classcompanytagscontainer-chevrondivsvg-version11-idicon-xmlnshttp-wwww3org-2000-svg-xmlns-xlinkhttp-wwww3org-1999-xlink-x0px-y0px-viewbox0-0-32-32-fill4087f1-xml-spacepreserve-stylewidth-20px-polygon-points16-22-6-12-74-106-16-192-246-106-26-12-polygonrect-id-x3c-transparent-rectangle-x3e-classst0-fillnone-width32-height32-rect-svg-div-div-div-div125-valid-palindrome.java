class Solution {
   public boolean isPalindrome(String S) {
    String s = S.toLowerCase();
    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
        if (!Character.isLetterOrDigit(s.charAt(i))) {
            i++;
            continue;
        }
        if (!Character.isLetterOrDigit(s.charAt(j))) {
            j--;
            continue;
        }

        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }

        i++;
        j--;
    }
    return true;
}

}