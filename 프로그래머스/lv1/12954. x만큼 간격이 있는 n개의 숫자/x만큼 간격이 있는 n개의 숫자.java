class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
         int a = x;
        long w = x;
        for (int i = 0; i < n; i++) {
            answer[i] = w;
            w+=a;
        }
        return answer;
    }
}