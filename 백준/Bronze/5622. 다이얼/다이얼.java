import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<String, Integer> map = new HashMap<>();
    map.put("A", 3);map.put("B", 3);map.put("C", 3);
    map.put("D", 4);map.put("E", 4);map.put("F", 4);
    map.put("G", 5);map.put("H", 5);map.put("I", 5);
    map.put("J", 6);map.put("K", 6);map.put("L", 6);
    map.put("M", 7);map.put("N", 7);map.put("O", 7);
    map.put("P", 8);map.put("Q", 8);map.put("R", 8);map.put("S", 8);
    map.put("T", 9);map.put("U", 9);map.put("V", 9);
    map.put("W", 10);map.put("X", 10);map.put("Y", 10);map.put("Z",10);

    String next = scanner.next();
    int answer= 0;
    for (int i = 0; i < next.length(); i++) {
      String alpa = String.valueOf(next.charAt(i));
      Integer num = map.get(alpa);
      answer += num;
    }
    System.out.println(answer);
  }}