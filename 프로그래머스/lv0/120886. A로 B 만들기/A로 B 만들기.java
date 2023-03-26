import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
  String[] split = before.split("");
        String[] split1 = after.split("");
        Arrays.sort(split);
        Arrays.sort(split1);
        if (Arrays.equals(split, split1)){
            answer = 1;
        }
             return answer;
}}