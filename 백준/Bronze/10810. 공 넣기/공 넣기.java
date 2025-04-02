
import java.util.*;
public class Main{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int maxNum = in.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<maxNum; i++){
            int firstIndex = in.nextInt();
            int secondIndex = in.nextInt();
            int num = in.nextInt();
            for(int j=firstIndex-1; j<secondIndex; j++){
                arr[j]= num;
            }
        }
        String answer = "";
        for(int i=0; i<arr.length; i++){
            answer += arr[i] + " ";
        }
        System.out.println(answer);
    }
}