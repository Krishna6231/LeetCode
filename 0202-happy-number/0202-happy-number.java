import java.util.*;
class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> seen = new HashSet<>();
       while(n!=1  && !seen.contains(n)){
        int total=0;
        seen.add(n);
        while(n>0){
            int digit = n%10;
            n=n/10;
            total+= digit*digit;
        }
        n=total;

       }
       return n==1;
    }
}