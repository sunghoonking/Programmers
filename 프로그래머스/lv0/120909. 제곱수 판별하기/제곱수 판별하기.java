class Solution {
    public int solution(int n) {
        int answer = 0;
        
        double a = Math.sqrt(n);
        if (a%1==0){
            answer =1;
        }else{
            answer =2;
        }
        return answer;
    }
}