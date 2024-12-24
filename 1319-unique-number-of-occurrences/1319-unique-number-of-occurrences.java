class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for(int i : arr){
            h1.put(i,h1.getOrDefault(i,0)+1);
        }
        HashSet<Integer> h2 = new HashSet<>();
        for(Object o : h1.keySet()){
            int key = (int) o;
            int val = h1.get(key);
            if(h2.contains(val)){
                return false;
            }
            else{
                h2.add(val);
            }
        }
        return true;
    }
}