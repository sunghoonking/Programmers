class Solution {
    public int solution(String A, String B) {
        int answer = 0;
   
        String repeat = B.repeat(3);
        answer = repeat.indexOf(A);
        return answer;
    }
}