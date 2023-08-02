class Solution {
    public int[] solution(int n, int m) {
                int[] answer = new int[2];
        int gcd = 0;
        if (n>m){
            gcd = gcd(n, m);
        } else {
            gcd = gcd(m, n);
        }
        int lcd = n * m / gcd;
        answer[0] = gcd;
        answer[1] = lcd;
        return answer;
    }
    
        public static int gcd(int n, int m){
        int key = n % m;
        if (key==0){
         return m;
        }else {
            return gcd(m,key);
        }
    }
}