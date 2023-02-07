class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        answer = new int[2];
        
//         int q = 0;
    
//         while(money-5500>=0){
//             q++;
//             money = money -5500;
//         }
        answer[0] = money/5500;
        answer[1] = money%5500;
        return answer;
    }
}