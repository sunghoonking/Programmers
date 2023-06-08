class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
                int[] array = new int[200];
        

        for (int i = 0; i < 3; i++) {
            int[] line = lines[i];
            int start = line[0] + 100;
            int end = line[1] + 100;
            for (int j = start; j < end; j++) {
                array[j] += 1;
            }
        }
        for (int a : array) {
            if (a>1){
                answer++;
            }
        }
        return answer;
    }
}