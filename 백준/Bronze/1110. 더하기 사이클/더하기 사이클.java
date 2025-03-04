

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count =0;
        int temp = num;
        while (true){
            int first = temp/10; // 2
            int second = temp%10; // 6
            int sum = first+second; // 8
            temp = second*10 + sum%10; // 68
            count++;
            if (temp==num){
                break;
            }
        }
        System.out.println(count);

    }
}
