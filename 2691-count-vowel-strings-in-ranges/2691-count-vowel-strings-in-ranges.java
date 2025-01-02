class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] prefix = new int[words.length];
        int sum=0;
        HashSet<Character> hs= new HashSet(Arrays.asList('a','e','i','o','u'));
        for(int i=0;i<words.length;i++){
            String word = words[i];
            if(hs.contains(word.charAt(0)) && hs.contains(word.charAt(word.length()-1))){
                sum++;
            }
            prefix[i] = sum;
        }
        int[] ans = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int[] arr = queries[i];
            ans[i] = prefix[arr[1]] - ( arr[0]==0 ? 0 : prefix[arr[0]-1]);
        }
        return ans;
    }
}