
import java.util.*;
public class Main{
    public static void main(String[] agrs){

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int divide = num / 4;
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i <= divide; i++){
            answer.append("long ");
        }

        System.out.println(answer.append("int"));
    }

}