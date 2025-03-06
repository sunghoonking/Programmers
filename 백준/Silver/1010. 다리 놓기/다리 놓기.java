import java.math.BigInteger;
import java.util.*;
public class Main{
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt(); // 테스트 케이스 개수
    for (int i = 0; i < num; i++) {
      int a = scanner.nextInt(); // 서쪽 사이트 개수 (m)
      int b = scanner.nextInt(); // 동쪽 사이트 개수 (n)

      BigInteger answer = factorial(b).divide(factorial(a).multiply(factorial(b - a))); // 조합 공식 C(n, m)
      System.out.println(answer);
    }
    scanner.close();
  }

  private static BigInteger factorial(int a) {
    BigInteger f = BigInteger.ONE;
    for (int i = 1; i <= a; i++) {
      f = f.multiply(BigInteger.valueOf(i));
    }
    return f;
  }
}