
import java.util.*;
import java.util.stream.IntStream;

public class Main{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String next = in.next();
        String next1 = in.next();

        String reverse1 = "";
        String reverse2 = "";

        for (int i = next1.length()-1; i >= 0; i--) {
            reverse1 += next.charAt(i);
            reverse2 += next1.charAt(i);
        }

        if (Integer.parseInt(reverse1) >Integer.parseInt(reverse2)){
            System.out.println(reverse1);
        }else {
            System.out.println(reverse2);
        }



    }
}