class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i=1;i<=len/2;i++){
            if (len % i == 0) {
                String sub = s.substring(0, i);
                StringBuilder ans = new StringBuilder();

                for (int j = 0; j < len / i; j++) {
                    ans.append(sub);
                }

                if (ans.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}