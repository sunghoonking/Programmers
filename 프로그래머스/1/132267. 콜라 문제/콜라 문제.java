class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (true){
            if (n < a){
                break;
            }
        int firstDivide = n / a;
                        firstDivide = firstDivide * b;

        if (firstDivide>0){
            answer += firstDivide;
            n = firstDivide + n % a;
          }
        }
        return answer;
    }
}