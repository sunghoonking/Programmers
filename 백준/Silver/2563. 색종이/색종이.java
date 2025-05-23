import java.util.*;
public class Main {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int n = scanner.nextInt(); 
  int[][] paper = new int[100][100];
  int area = 0; 

  for (int i = 0; i < n; i++) {
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    for (int j = x; j < x + 10; j++) {
      for (int k = y; k < y + 10; k++) {
        if (paper[j][k] == 0) {
          paper[j][k] = 1; 
          area++;
        }
      }
    }
  }
  System.out.println(area);
}
}