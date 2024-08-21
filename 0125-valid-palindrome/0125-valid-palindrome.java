class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.trim().isEmpty())
            return true;
        // s = s.replace(" ", "").toLowerCase();

        // StringBuilder sb = new StringBuilder();

        // for(int i = 0 ;i<s.length();i++){
        //     char c = s.charAt(i);
        //     if(Character.isDigit(c) || Character.isAlphabetic(c)){
        //         sb.append(c);
        //     }
            
        // }
        int i = 0;
        int j = s.length() - 1;

        // while (i < j) {
        //     if (sb.charAt(i) == sb.charAt(j)) {
        //         i++;
        //         j--;
        //     } else {
        //         return false;
        //     }
        // }

        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}