
class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int num = 0;
        for(int i = 0; i < count;i++){
            num += price;
            answer += num;
        }
        if(answer>money){
            answer = Math.abs(answer-money);
        }else{
            answer = 0;
        }

        return answer;
    }
}