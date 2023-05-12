import java.util.Arrays;
class Solution {
    public int[] solution(int[] numlist, int n) {
                int[] answer = new int[numlist.length];
        int[] min = new int[numlist.length];

        for (int i = 0; i <numlist.length; i++) {
            int abs = Math.abs(n - numlist[i]);
            min[i] = abs;
        }
        Arrays.sort(min);

        Arrays.sort(numlist);
        for (int i = 0; i < numlist.length; i++) {
            for (int j = numlist.length-1; j >-1; j--) {
                int abs = Math.abs(n - numlist[j]);
                if (min[i]==abs){
                    if (answer[i]==0){
                        answer[i] = numlist[j];
                        numlist[j] = 0;
                    }
                }
            }
        }
        return answer;
    }
}