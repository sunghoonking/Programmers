  import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int n = scanner.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i+1;
    }

    for (int i = 0; i < n; i++) {
      int start = scanner.nextInt();
      int end = scanner.nextInt();
      for (int j = start; j <= end; j++) {
        int temp = arr[end - 1];
        arr[end - 1] = arr[j - 1];
        arr[j - 1] = temp;
        end--;
      }
    }
    String answer = "";
    for (int i = 0; i < arr.length; i++) {
      answer += arr[i] + " ";
    }
    System.out.println(answer);
  }
  }