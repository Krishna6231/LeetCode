class Solution {

    public void sortColors(int[] nums) {
        boolean sort = false;
        int c = 0;
        while (!sort) {
            sort = true;
            for (int i = 0; i < nums.length - 1 - c; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    sort = false;
                }
            }
            c++;
        }
    }
}