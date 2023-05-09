class Solution {
    public int[] solution(int[][] score) {
               int[] answer = new int[score.length];
        double[] arr = new double[score.length];
        for (int i = 0; i < score.length; i++) {
            int totalScore = score[i][0] + score[i][1];
            double average = (double)totalScore / 2;
            arr[i] = average;
         }
  
        for (int i = 0; i < arr.length ; i++) {
            int rank = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]){
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }
}