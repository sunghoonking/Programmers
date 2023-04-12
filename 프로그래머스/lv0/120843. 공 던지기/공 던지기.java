class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        double target = 0.5;
        for (int i = 0; i <numbers.length ; i++) {
            target = target+0.5;
            if(target==k){
                answer= numbers[i];
                break;
            }
            if (i==numbers.length-1){
                i=-1;
            }

        }
        return answer;
        
    }
}