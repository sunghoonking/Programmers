import java.math.BigInteger;
class Solution {
    public BigInteger solution(int balls, int share) {
 
        
        BigInteger key = factorial(balls);
        BigInteger multiply = factorial(balls - share).multiply(factorial(share));

        BigInteger divide = key.divide(multiply);
        return divide;

    }
    public static BigInteger factorial(long num){
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 1; i <= num; ++i) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}