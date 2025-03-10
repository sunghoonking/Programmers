
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 반복문을 통해 입력 받기
        Scanner scanner = new Scanner(System.in);
        int temp = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<10; i++){
            int num = scanner.nextInt();
            int divide = num% 42;
            if(temp!=divide){
                map.put(divide,temp);
                temp =divide;
            }
        }

        System.out.println(map.size());

        scanner.close();
    }
}
