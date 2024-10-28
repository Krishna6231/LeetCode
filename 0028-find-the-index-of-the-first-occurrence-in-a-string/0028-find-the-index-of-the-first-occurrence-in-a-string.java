class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int h = haystack.length();
        int i=0;int ans=0;
        while(i<=(h-n)){
            String sub = haystack.substring(i,i+n);
            if(sub.equals(needle)){
                ans = i;
                break;
            }
            else{
                i++;
            }
        }

        if(i>(h-n)){
            return -1;
        }else{
         return ans;}

    }
}