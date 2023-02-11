class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int q:array){
            if (q>height){
                answer++;
            }
        }
        return answer;
    }
}