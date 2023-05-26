import java.math.BigInteger;
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
              int[] answer = new int[2];
        numer1 *= denom2;
        numer2 *= denom1;

        int son = numer1+numer2;
        int mother = denom1 * denom2;
        BigInteger mo = BigInteger.valueOf(mother);
        BigInteger so = BigInteger.valueOf(son);
        BigInteger gcd;
        if (mother>son){
            gcd = mo.gcd(so);
        }else {
            gcd = so.gcd(mo);
        }
        int i = Integer.parseInt(String.valueOf(gcd));
        answer[0] = son/i;
        answer[1] = mother/i;
    
        return answer;
    }
}