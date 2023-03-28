class Solution {
    public int solution(int n) {
        int answer = 0;
                int a = 1;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <=n ; i++) {
            a = a * i;
//            System.out.println(n-a);
//            int abs = Math.abs(n - a);
            int abs = n - a;
            if(a==n){
                answer = i;
            }
            else if(abs > 0 && abs<min)  {
                min = abs;
                answer = i;
            }
        }
        return answer;
    }
}