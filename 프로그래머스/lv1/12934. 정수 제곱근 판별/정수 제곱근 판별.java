class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        double v = sqrt % 1;
        if ( v ==0.0){
            long gold = (long) sqrt + 1;
            answer = gold * gold;
        }else {
            answer = -1;
        }
        return answer;
    }
}