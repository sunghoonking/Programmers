
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력 받기
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();

        int thingSize = scanner.nextInt();
        int sumPrice = 0;
        for (int i = 0; i < thingSize; i++) {
            sumPrice += scanner.nextInt() * scanner.nextInt();
        }
        if (price==sumPrice){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
    }
}
