
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] agrs) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        String star = "*";
        for(int i = 1; i <= num; i++){
            System.out.println(star);
            star = star + "*";
        }


    }

}