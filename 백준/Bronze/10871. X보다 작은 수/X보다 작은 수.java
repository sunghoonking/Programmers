
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] agrs) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int key = scanner.nextInt();
        String answer = "";
        for (int i = 0; i < num; i++) {
            int w = scanner.nextInt();
            if (key > w){
                answer = answer + w + " ";
            }
        }
        System.out.println(answer);


    }

}