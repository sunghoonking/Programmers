import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(arr);
            int key = commands[i][2];
            answer[i] = arr[key - 1];
        }
        return answer;
    }
}