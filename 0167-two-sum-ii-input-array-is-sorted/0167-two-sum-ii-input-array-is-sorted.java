class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        // for(int i =0 ;i < numbers.length -1 ;i++){
        //     for(int j=i+1 ; j < numbers.length ;j++){
        //         if(numbers[i]+numbers[j]==target){
        //             result[0]=i+1;
        //             result[1]=j+1;
        //             break;
        //         }
        //     }
        // }
        //                     return result;

        int i=0;int j= numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                    result[0]=i+1;
                    result[1]=j+1;
                    break;
                }
                else if(numbers[i]+numbers[j]>target){
                    j--;
                }
                else{
                    i++;
                }
        }
        return result;

    }
}