import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer= "";
        String key = "*";
        int a = sc.nextInt();
        for (int i = 0; i < a  ; i++) {
            answer+= key;
        }
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            System.out.println(answer);
        }
    }
}