
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        while (sc.hasNext()) {
            String next = sc.nextLine().toLowerCase();
            if(next.equals("#")){
                break;
            }
            int count = 0;

            for (int i = 0; i < next.length(); i++) {
                if (vowels.contains(next.charAt(i))) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
