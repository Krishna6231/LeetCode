class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> h1= new HashMap<>();
        for (char c: s.toCharArray()){
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray()){
            if(h1.containsKey(c)){
                h1.put(c,h1.get(c)-1);
            }
            else{
                h1.put(c,-1);
            }
        }
        boolean flag=true;
        for(int count : h1.values()){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}