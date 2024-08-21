class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.trim().isEmpty())
            return true;
        s = s.replace(" ", "").toLowerCase();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c) || Character.isAlphabetic(c)){
                sb.append(c);
            }
            
        }
        int i = 0;
        int j = sb.length() - 1;

        while (i < j) {
            if (sb.charAt(i) == sb.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }
}