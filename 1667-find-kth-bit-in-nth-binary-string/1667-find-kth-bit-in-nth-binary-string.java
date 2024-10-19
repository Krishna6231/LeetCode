class Solution {
    private String invert(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            sb.append(c == '0' ? '1' : '0');
        }
        return sb.toString();
    }

    private String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public char findKthBit(int n, int k) {
        String[] a1=new String[n];
        a1[0] = "0";
        for(int i = 1 ; i < n ; i++){
            a1[i] = a1[i - 1] + "1" + reverse(invert(a1[i - 1]));
        }
        String result = a1[n-1];
        return result.charAt(k-1);
    }
}