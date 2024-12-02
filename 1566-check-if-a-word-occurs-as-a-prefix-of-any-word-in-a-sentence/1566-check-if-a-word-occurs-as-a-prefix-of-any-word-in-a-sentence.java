class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        int count=0;
        for(String s:words){
            count++;
            if(s.length()>=searchWord.length()){
            String sub = s.substring(0,searchWord.length());
            if(sub.equals(searchWord)){
                return count;
            }
            }
        }
        return -1;
    }
}