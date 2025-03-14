

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 반복문을 통해 입력 받기
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        for(int i=0; i<3; i++) {
            answer= 0;
            String a = scanner.nextLine();
            String[] split = a.split(" ");
            for (int j=0; j<split.length; j++) {
                if (split[j].equals("0")) {
                    answer++;
                }
            }
            if(answer==1){
                System.out.println("A");
            }else if(answer==2){
                System.out.println("B");
            }else if(answer==3){
                System.out.println("C");
            }else if(answer==4){
                System.out.println("D");
            }else {
                System.out.println("E");
            }
        }


    }
}
