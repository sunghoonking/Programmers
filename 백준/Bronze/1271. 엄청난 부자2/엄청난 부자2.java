import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BigInteger money = sc.nextBigInteger();
        BigInteger creature = sc.nextBigInteger();
        System.out.println(money.divide(creature));
        System.out.println(money.remainder(creature));
    }
}
