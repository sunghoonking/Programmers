class Solution {
    public int solution(int n) {

        int answer = 0;
      while (n>0){
            n = n-7;
            answer++;
        }
        return answer;
    }
}