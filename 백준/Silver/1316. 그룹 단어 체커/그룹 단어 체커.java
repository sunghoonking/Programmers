import java.util.*;
  public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int answer = 0;
    for(int i =0 ; i <num;i++){
      String next = scanner.next();
      answer++;

      outerLoop:
      for (int j = 0; j < next.length(); j++) {
        char c = next.charAt(j);
        boolean check = true;
        for (int t = j + 1; t < next.length(); t++) {
          if (c == next.charAt(t)) {
            if (!check) {
              answer--;
              break outerLoop;  // 외부 for문(j 루프)까지 한 번에 탈출
            }
          } else {
            check = false;
          }
        }
      }
    }
    System.out.println(answer);
  }}
