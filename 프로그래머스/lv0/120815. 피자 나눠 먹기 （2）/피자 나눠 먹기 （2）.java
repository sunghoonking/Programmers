class Solution {
    public int solution(int n) {
        int answer = 0;
                for(int i = 1; i < n+1; i++){
            int a = i * 6;
            if(a >= n) {
                int key = a % n;
                if(key == 0){
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
}