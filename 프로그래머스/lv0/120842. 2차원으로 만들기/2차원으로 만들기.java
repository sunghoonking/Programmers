class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
                int a = 0;
        int[][] two = new int[num_list.length/n][n];
        for (int i = 0; i < num_list.length/n ; i++) {
            for (int j = 0; j <n ; j++) {
                two[i][j] = num_list[a];
                a++;
            }
        }
        answer =two;
        return answer;
    }
}