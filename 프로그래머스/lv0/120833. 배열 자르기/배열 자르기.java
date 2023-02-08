class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
                int i1 = num2 - num1 + 1;
        answer = new int[i1];

        int a =0;
        for (int i = num1; i <num2+1; i++) {
            answer[a] = numbers[i];
            a++;
        }
        return answer;
    }
}