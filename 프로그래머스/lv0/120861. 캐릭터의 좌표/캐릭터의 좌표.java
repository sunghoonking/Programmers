class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
                for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "up":
                    answer[1] += 1;
                    break;
                case "down":
                    answer[1] -= 1;
                    break;
                case "left":
                    answer[0] -= 1;
                    break;
                default:
                    answer[0] += 1;
                    break;
            }
            int x = Math.abs(answer[0]);
            int y = Math.abs(answer[1]);
            if (x> board[0]/2){
                if (answer[0] > 0){
                    answer[0] -= 1;
                }else {
                    answer[0] += 1;
                }

            }
            if (y>board[1]/2){
                if (answer[1] > 0){
                    answer[1] -= 1;
                }else {
                    answer[1] += 1;
                }
            }
        }
        return answer;
    }
}