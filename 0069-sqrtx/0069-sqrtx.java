class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int low = 0, high = x, mid=0,result =0;
        while(low<=high){
            mid = (low+high)/2;
            long val = (long) mid*mid;

            if(val > x){
                high = mid-1;
            }
            else if(val < x){
                low = mid+1;
                result = mid;
            }
            else {
                return mid;
            }
            
        }
            // System.out.print(mid);
            return result;

    }
}