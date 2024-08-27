class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] c = new int[nums1.length+nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            c[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i = i + 1) {
            c[nums1.length + i] = nums2[i];
        }
        Arrays.sort(c);
        int n = c.length-1;
        if(c.length%2==0){
            return (c[n/2]+(c[(n/2)+1]))/2.0;
        }
        else{
            return c[n/2];
        }
    }
}