
import java.util.*;
public class Main{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int[] arr = new int[num];
        for(int i =0; i < num; i++){
            arr[i] = i+1;
        }
        int length = in.nextInt();
        for (int i = 0; i < length ; i++) {
            int first = in.nextInt()-1;
            int second = in.nextInt()-1;
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i] + " ";
        }
        System.out.println(answer);
    }
}