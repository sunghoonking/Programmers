  import java.util.*;
  public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
                 // 10
    Map<String,Integer> map = new HashMap<>();
    map.put("a",-1);map.put("b",-1);map.put("c",-1);map.put("d",-1);map.put("e",-1);map.put("f",-1);
    map.put("g",-1);map.put("h",-1);map.put("i",-1);map.put("j",-1);map.put("k",-1);map.put("l",-1);map.put("m",-1);map.put("n",-1);
    map.put("o",-1);map.put("p",-1);map.put("q",-1);map.put("r",-1);map.put("s",-1);map.put("t",-1);map.put("u",-1);map.put("v",-1);
    map.put("w",-1);map.put("x",-1);map.put("y",-1);map.put("z",-1);

    for(Map.Entry<String, Integer> entry : map.entrySet()){
      String key = entry.getKey();
      for(int i = 0; i < input.length(); i++){
        if(key.equals(String.valueOf(input.charAt(i)))){
          map.put(key,i);
          break;
        }
      }
    }
    StringBuilder answer = new StringBuilder();
    for(Map.Entry<String, Integer> entry : map.entrySet()){
      answer.append(entry.getValue()).append(" ");
    }
    System.out.println(answer);

  }}