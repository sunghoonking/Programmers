

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        in.nextLine();

        String[] board = new String[row];
        for (int i = 0; i < row; i++) {
            board[i] = in.nextLine();
        }
        int sol = Integer.MAX_VALUE;
        for (int i= 0; i<= row-8;i++){
            for (int j= 0; j<= col-8;j++){
                int curSol = process(i,j,board);
                if (sol>curSol){
                    sol = curSol;
                }
            }
        }
        System.out.println(sol);

    }

    private static int process(int startRow, int startCol, String[] board) {
        String[] mainBoard = {"WBWBWBWB","BWBWBWBW"};
        int answer = 0;
        for (int i = 0; i <8 ; i++) {
            int row = startRow + i;
            for (int j = 0; j < 8; j++) {
                int col = startCol + j;
                if (board[row].charAt(col) != mainBoard[row%2].charAt(j)){
                    answer++;
                }
            }
        }
        return Math.min(answer, 64-answer);
    }


}
