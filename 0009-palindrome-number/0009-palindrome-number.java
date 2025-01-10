class Solution {
    public boolean isPalindrome(int x) {
        int n = x;int rem=0;
        if(x<0){
            return false;
        }
        while(n>0){
            rem = (rem*10)+(n%10);
            n = n/10;
        }
        if(rem==x){
            return true;
        }
        return false;
    }
}