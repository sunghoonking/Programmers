
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] agrs) throws IOException {

        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextInt()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
                System.out.println(a+b);
        }


    }

}