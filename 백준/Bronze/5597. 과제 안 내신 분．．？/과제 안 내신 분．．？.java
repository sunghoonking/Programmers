import java.util.*;
public class Main{
      public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<Integer, Integer> map = new HashMap<>();
    for(int i =0; i< 28;i++){
      int a = scanner.nextInt();
      map.put(a, a);
    }
    for(int i = 1; i < 31; i++){
      if (map.get(i)==null){
        System.out.println(i);
      }
    }
  }
}