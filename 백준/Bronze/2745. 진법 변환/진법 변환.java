import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N = scanner.next();
        int B = scanner.nextInt();

        // long으로 처리하여 더 큰 값도 안전하게 변환
        long result = Long.parseLong(N, B);

        System.out.println(result);
    }
}