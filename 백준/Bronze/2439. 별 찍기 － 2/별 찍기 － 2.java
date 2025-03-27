
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] agrs) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        String star = "";
        String starTo = "";
        for(int i = 1; i <= num; i++){
            star = "";
          for(int j = i+1; j <= num; j++){
            star = star + " ";
          }
          starTo = starTo + "*";
          star = star + starTo;
          System.out.println(star);
        }


    }

}