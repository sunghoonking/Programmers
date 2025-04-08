  import java.util.*;
  public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    double[] arr = new double[num];
    for (int i = 0; i < num; i++) {
      arr[i] = scanner.nextInt();
    }
    Arrays.sort(arr);
    double max = arr[num - 1];
    for(int i = 0; i < num; i++) {
       double number = arr[i];
        arr[i] =  number / max * 100;
    }
    double answer = 0;
    for (int i = 0; i < num; i++) {
       answer += arr[i];
    }
    System.out.println(answer/num);
  }
}