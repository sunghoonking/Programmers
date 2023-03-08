import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder stringBuilder = new StringBuilder();
        String q = "*";
        for (int i = 0; i < n; i++) {
            stringBuilder.append(q+"\n");
            q += "*";
        }
        System.out.println(stringBuilder);
    }
}