
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 반복문을 통해 입력 받기
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int answer= 0;
        for(int i=0; i<num; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int result = 1;
            for(int j=0; j<b; j++) {
                result = (result*a)%10;
            }
            if(result == 0){
                System.out.println("10");
            }else{
                System.out.println(result);
            }
        }
    }
}
