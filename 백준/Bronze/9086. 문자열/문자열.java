import java.util.*;  
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    for (int i = 0; i < num; i++) {
      String next = scanner.next();
      String first = String.valueOf(next.charAt(0));
      String last = String.valueOf(next.charAt(next.length() - 1));
      System.out.println(first + last);
    }
  }
}