//HashSet doesnt Store Duplicates. When calculating happy number , pattern can repeat like 1,2,3,1,2,3 So, if pattern is there it is not a happy number 
// Here HashSet doesnt store duplicates it stores the first added ele only , even if we try to add another duplicate . So if there is a pattern it will be in HashSet 
//Once it is detected it is repeating number loop is exited as it will be false and it will not be equal to 1 and if no pattern is there we will get answer as true
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
