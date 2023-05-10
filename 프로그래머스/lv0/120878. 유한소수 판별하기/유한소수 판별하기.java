import java.util.*;
class Solution {
    public int solution(int a, int b) {
              int answer = 2;
        int gcd = gcd(a, b);
        a /= gcd;
        b /= gcd;
        int q = 2;
        List<Integer> w = new ArrayList<>();

        if (b!=1){
            while (true){
                if (q>b){
                    break;
                }
                if (b%q==0){
                    w.add(q);
                    b /= q;
                } else {
                    q++;
                }
            }
                  for (int e :w) {
                if (e==2 || e==5){
                    answer =1;
                }else {
                    answer =2;
                    break;
                }
            }
        }else {
            answer =1;
        }

        return answer;
    }
    
        public static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
