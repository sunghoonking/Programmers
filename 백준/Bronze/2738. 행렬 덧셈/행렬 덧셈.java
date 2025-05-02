  import java.util.*;
    public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
        StringBuilder answer = new StringBuilder();
            for (int j = 0; j < y; j++) {
                int ans = arr[i][j] + scanner.nextInt();
                answer.append(ans).append(" ");
            }
            System.out.println(answer);
        }
 }
    }