  import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    for (int i = 0; i <num ; i++) {
      int num2 = scanner.nextInt();
      String next = scanner.next();
      String answer = "";
      for(int j = 0; j < next.length(); j++) {
        String alpa = String.valueOf(next.charAt(j));
        for(int k = 0; k < num2; k++) {
          answer += alpa;
        }
      }
      System.out.println(answer);
  }
  }
  }