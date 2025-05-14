import java.util.Scanner; 
  public class Main{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String[][] arr = new String[15][15];
      StringBuilder answer= new StringBuilder();
      for (int i = 0; i < 5; i++) {
        String next = scanner.next(); // ABCDE
        for (int j = 0; j < next.length(); j++) {
          arr[j][i] = String.valueOf(next.charAt(j));
        }
      }
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
          if (arr[i][j] != null) {
            answer.append(arr[i][j]);
          }
        }
      }
      System.out.println(answer);
    }
  }