import java.util.*;
  public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<String, Double> map = new HashMap<>();
    map.put("A+",4.5);map.put("A0",4.0);
    map.put("B+",3.5);map.put("B0",3.0);
    map.put("C+",2.5);map.put("C0",2.0);
    map.put("D+",1.5);map.put("D0",1.0);
    map.put("F",0.0);

    int num = 0;

    double sum = 0;
    double subJectSum = 0;
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      if (line.isEmpty()) break;
      num++;
      String[] split = line.split(" ");
      if (split[2].equals("P")){
        num--;
        continue;
      }
      double score = Double.parseDouble(split[1]);
      Double gradeScore = map.get(split[2]);
      subJectSum += score;
      sum += score * gradeScore;
    }
    System.out.println(sum/subJectSum);
  }
  }