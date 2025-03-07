import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[]{1,1,2,2,2,8};

        String s = scanner.nextLine();
        String[] split = s.split(" ");
        String answer = "";
        for(int i=0; i<split.length; i++) {
            answer += array[i]-=Integer.parseInt(split[i]);
            answer += " ";

        }
        System.out.println(answer);


    }
}
