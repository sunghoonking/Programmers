
import java.util.*;
public class Main{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String next = in.next();
        int i = in.nextInt();
        String c = String.valueOf(next.charAt(i-1));
        System.out.println(c);
    }
}