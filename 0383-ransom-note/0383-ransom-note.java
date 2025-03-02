class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c : ransomNote.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(Character c : magazine.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        boolean flag = false;
        for(Object o:map.keySet()){
            char key = (char) o;
            int val = map.get(key);
            if(map2.containsKey(key) && map2.get(key)>=val){
                flag=true;
            }
            else{
                return false;
            }
        }

        return flag;
    }
}