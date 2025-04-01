
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] numbers = new int[9];
        int[] numbers2 = new int[9];

        for (int i = 0; i < 9; i++) {
            numbers[i] = in.nextInt();
            numbers2[i] = numbers[i];
        }
        Arrays.sort(numbers);
        int number = numbers[8];

        for (int i = 0; i < 9; i++) {
            if (number == numbers2[i]) {
                System.out.println(number);
                System.out.println(i+1);
            }
        }

    }
}