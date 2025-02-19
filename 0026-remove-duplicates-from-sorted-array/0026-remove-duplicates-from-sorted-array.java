class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0,j=i+1;
        while(j<n){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
                j++;
            }
            else if(nums[i]==nums[j]){
                j++;
            }
        }
        return i+1;
    }
}