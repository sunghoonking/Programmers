class Solution {
    public int solution(int num) {
        long longNum = num;
        int answer = -1;
        if (longNum==1){
            answer = 0;
        }else {
            for (int i = 1; i <501; i++) {
                if (longNum%2==0){
                    longNum = longNum/2;
                }else {
                    longNum= (longNum*3)+1;
                }
                if (longNum==1){
                    answer = i;
                    break;
                }
            }
        }
        return answer;
    }
}