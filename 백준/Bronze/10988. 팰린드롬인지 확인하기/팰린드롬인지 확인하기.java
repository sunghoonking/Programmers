  import java.util.*;
  public  class  Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String next = scanner.next();
    StringBuilder word = new StringBuilder();
    for(int i = next.length() - 1; i >= 0; i--) {
      word.append(next.charAt(i));
    }
    if (next.contentEquals(word)) {
      System.out.println("1");
    } else {
      System.out.println("0");
    }
  }}