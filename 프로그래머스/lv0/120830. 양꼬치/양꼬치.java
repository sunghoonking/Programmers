class Solution {
    public int solution(int n, int k) {
        int answer = 0;

        int qwe = 0;
        for(int i = 10; i<=n; i++){
            if(i%10==0){
                qwe++;
            }
        }
        int qqq = k-qwe;
        answer = (n*12000) + (qqq*2000);
    
        return answer;
    }
}