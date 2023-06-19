import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String a= String.valueOf(n);
        String[] split = a.split("");
        for (int i = 0; i < split.length; i++) {
            int q = Integer.parseInt(split[i]);
            answer+=q;
        }

        return answer;
    }
}