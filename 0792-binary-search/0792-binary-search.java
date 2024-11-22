class Solution {
    public int binary (int[] arr, int target , int s , int e ){
        if(s>e){
            return -1;
        }
        int m = s + (e - s) / 2;

        if(arr[m]<target){
            return binary(arr,target,m+1,e);
        }
        if(arr[m]==target){
            return m;
        }
         return binary(arr,target,s,m-1);
    }
    public int search(int[] nums, int target) {
       return (binary(nums,target,0,nums.length-1));
    }
}