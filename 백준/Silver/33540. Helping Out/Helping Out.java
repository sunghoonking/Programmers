
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeMap<String,Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            Integer score = Integer.valueOf(in.next());
            if (map.containsKey(name)) {
                map.put(name,map.get(name)+score);
            }else {
            map.put(name,score);
            }
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}