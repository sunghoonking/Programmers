class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp =0;
           for (int i = n; i >= 1; i--) {
            temp=0;
            for (int j = 1; j <= n; j++) {
                if(i%j==0){
                    temp++;
                }
                if(temp>=3){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}