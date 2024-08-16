class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c5=0;int c10=0;int c=0;
        for(int i =0;i<bills.length;i++){
            if(bills[i]==5){
                c5++;
                c++;
                bills[i]=0;
            }
            else if(bills[i]==10){
                if(c5>0){
                c10++;
                c5--;
                c++;
                bills[i]=0;
                }
                
            }
            else{
                if(c5>0 && c10>0){
                c10--;
                c5--;
                c++;
                bills[i]=0;
                }
                else if(c5>=3 ){
                    c5=c5-3;
                    bills[i]=0;
                    c++;
                }
                
            }
        }
        return c==bills.length;
    }
}