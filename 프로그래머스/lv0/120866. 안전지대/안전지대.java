class Solution {
    public int solution(int[][] board) {
                int[][] wide = new int[board.length+2][board[0].length+2];
        int answer = 0;


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                wide[i + 1][j + 1] = board[i][j];
            }
        }
        for (int i = 1; i < wide.length-1; i++) {
            for (int j = 1; j < wide[1].length-1; j++) {
                if (wide[i][j]==1){
                    if (wide[i][j+1]!=1){
                        wide[i][j+1]=2;
                    }
                    if (wide[i][j-1]!=1){
                        wide[i][j-1]= 2;
                    }
                    if (wide[i-1][j]!=1){
                        wide[i-1][j]= 2;
                    }
                    if (wide[i+1][j]!=1){
                        wide[i+1][j]= 2;
                    }
                    if (wide[i-1][j+1]!=1){
                        wide[i-1][j+1]= 2;
                    }
                    if (wide[i-1][j-1]!=1){
                        wide[i-1][j-1]= 2;
                    }
                    if (wide[i+1][j-1]!=1){
                        wide[i+1][j-1]= 2;
                    }
                    if (wide[i+1][j+1]!=1){
                        wide[i+1][j+1]= 2;
                    }
                }
            }
        }

        for (int i = 1; i <wide.length-1 ; i++) {
            for (int j = 1; j <wide[1].length-1 ; j++) {
                if (wide[i][j]==0){
                    answer++;
                }
            }
        }
        return answer;
    }
}