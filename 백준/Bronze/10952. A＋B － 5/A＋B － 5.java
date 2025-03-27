
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] agrs) throws IOException {

        Scanner scanner = new Scanner(System.in);


        while (true){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a==0 && b==0){
                break;
            }
            System.out.println(a + b);
        }


    }

}