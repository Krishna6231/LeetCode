class Solution {
    public String reverseVowels(String s) {
        char[] car = s.toCharArray();
        int i=0;
        int j=s.length() - 1;
        String vowels = "aeiouAEIOU";

        while(i<j){


//             We can use the indexOf method in the String class to see if the character is present:

// boolean isInVowelsString(char c) {
//     return VOWELS.indexOf(c) != -1;
// }
// Copy
// If the character is present, the index will not be -1. If it’s -1, then the character is not in the set of vowels. 
            while(i<j && vowels.indexOf(car[i]) == -1){
                i++;

            }
            while(i<j && vowels.indexOf(car[j]) == -1){
                j--;
                
            }
            char temp = car[i];
            car[i]=car[j];
            car[j]=temp;

            i++;
            j--;
        }

        String answer  = new String(car);
        return answer;
    }
}