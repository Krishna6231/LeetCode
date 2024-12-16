class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        String[] parts=str.split(" ");
        String ans = parts[parts.length-1];
        return ans.length();
    }
}