class Solution {
    public String addSpaces(String s, int[] spaces) {
        int j=0; StringBuilder ans = new StringBuilder();
        for(int i: spaces){
             ans.append(s.substring(j,i)).append(" ");
            j=i;
        }
        ans.append(s.substring(j));
        return ans.toString();
    }
}