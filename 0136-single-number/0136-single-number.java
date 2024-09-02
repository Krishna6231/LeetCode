class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> h1 = new HashMap<>();

        if(nums.length==1) return nums[0];
        
        for(int i: nums){
            h1.put(i,h1.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : h1.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
            
        }
        return -1;
    }
}