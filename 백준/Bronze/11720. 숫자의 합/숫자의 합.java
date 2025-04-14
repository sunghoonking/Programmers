import java.util.*;
  public class Main{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
      int answer = 0;
      String next = scanner.next();
      for (int i = 0; i < num; i++) {
        answer += next.charAt(i)-48;
      }
      System.out.println(answer);
    }  
  }
  