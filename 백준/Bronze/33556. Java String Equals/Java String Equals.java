
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 반복문을 통해 입력 받기
        Scanner scanner = new Scanner(System.in);

        String first = scanner.next();
        String second = scanner.next();

        if(first.equals("null")) {
            System.out.println("NullPointerException");
            System.out.println("NullPointerException");
        }else if(second.equals("null")) {
            System.out.println(false);
            System.out.println(false);
        }
        else{
            System.out.println(first.equals(second));
            System.out.println(first.equalsIgnoreCase(second));
        }

    }
}
