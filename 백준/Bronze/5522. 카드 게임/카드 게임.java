
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer =0;
        while (in.hasNext()){
            int n = in.nextInt();
            answer+= n;
        }
        System.out.println(answer);
       
    }
}