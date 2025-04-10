import java.util.*;
public class Main{
  public static void main(String[] args){


    Scanner scanner = new Scanner(System.in);

    String word = scanner.next();
    int answer = 0;
    for(int i=0;i<word.length();i++){
      answer ++;
    }
    System.out.println(answer);
  }
}