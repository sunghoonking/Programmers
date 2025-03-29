
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] agrs) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();

        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                answer++;
            }

        }
        System.out.println(answer);


    }

}