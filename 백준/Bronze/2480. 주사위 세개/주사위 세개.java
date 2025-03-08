
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);

        int answer = 0;

        if(a==b || a==c || b==c){
            if(a==b){
                answer = 1000+a*100;
            }else if(a==c){
                answer = 1000+a*100;
            }else{
                answer = 1000+b*100;
            }
        }
        if(a!=b && a!=c && b!=c){
            answer = arr[2]*100;
        }
        if(a==b && a==c){
            answer = 10000+a*1000;
        }
        System.out.println(answer);
    }
}
