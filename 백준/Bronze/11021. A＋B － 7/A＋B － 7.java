
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] agrs) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++){
            int sum = scanner.nextInt() + scanner.nextInt();
            System.out.println("Case #" + i +": " + sum);
        }


    }

}