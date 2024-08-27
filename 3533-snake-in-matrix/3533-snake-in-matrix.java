class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {

        int[][] mat = new int[n][n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=count++;
            }
        }
        int num = 0;
        int i=0;int j=0;
        for(String s : commands){
            if(s.equals("RIGHT")){
            j+=1;
            }
            else if(s.equals("LEFT")){
                                j-=1;

            }
             else if(s.equals("UP")){
                                i-=1;

            }
             else if(s.equals("DOWN")){
                                i+=1;

            }
        }
                    return mat[i][j];

    }
}