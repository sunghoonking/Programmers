import java.math.BigInteger;
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
         int[] answer = new int[2];
        int key = 0;
        int key2 = 0;
        int bunJa = 0;
        int bunMo = 0;
        if (denom1!=denom2){
            for (int i = 1; i < 1000; i++) {
                int i1 = denom1 * i;
                for (int j = 1; j < 1000; j++) {
                    int i2 = denom2 * j;
                    if (i1 == i2){
                        key= i;
                        key2=j;
                        break;
                    }
                }
                if (key!=0){
                    break;
                }
            }
            bunJa = numer1 * key + numer2 * key2;
           bunMo = denom1 * key;

        }else {
            bunJa = numer1+numer2;;
             bunMo = denom1;

        }
        BigInteger bj = BigInteger.valueOf(bunJa);
        BigInteger bm = BigInteger.valueOf(bunMo);
        BigInteger gcd;
        if (bunJa>bunMo){
            gcd = bj.gcd(bm);
        }
        else {
            gcd = bm.gcd(bj);
        }
        
        int i = Integer.parseInt(String.valueOf(gcd));
        bunJa /= i;
        bunMo /= i;
        answer[0] = bunJa;
        answer[1] = bunMo;
    
        return answer;
    }
}