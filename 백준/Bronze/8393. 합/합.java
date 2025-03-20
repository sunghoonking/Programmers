import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력 받기
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int answer = 0;
        for (int i = 1; i < num+1; i++) {
            answer += i;
        }
        System.out.println(answer);
    }
}
