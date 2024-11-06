class Solution {
    public String compressedString(String word) {
        char c = word.charAt(0);
        String ans="";int count=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==c && count<9){
                count++;
            }
            else{
                ans+=String.valueOf(count)+c;
                c=word.charAt(i);
                count = 1;
            }

        }
        ans+=String.valueOf(count)+c;
        return ans;
    }
}