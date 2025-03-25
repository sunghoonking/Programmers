
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] agrs) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++){
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int sum = first + second;
            System.out.println("Case #" + i +": " + first + " + " + second + " = " + sum);
        }


    }

}