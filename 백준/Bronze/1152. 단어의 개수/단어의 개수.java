  import java.util.*;
  public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String sentence = scanner.nextLine();
    // st 에 공백을 기준으로 나눈 토큰들을 st 에 저장한다
    StringTokenizer st = new StringTokenizer(sentence," ");
    System.out.println(st.countTokens());
  }
  }