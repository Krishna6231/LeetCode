class Solution {
    public int prefixCount(String[] words, String pref) {
        
        // String[] words = sentence.split(" ");
        int count=0;
        for(String s:words){
            
            if(s.length()>=pref.length()){
            String sub = s.substring(0,pref.length());
            if(sub.equals(pref)){
                count++;
            }
            }
        }
        return count;
    }
}