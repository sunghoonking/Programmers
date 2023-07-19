import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");
     Arrays.sort(split);
        for (int i = split.length-1; i>=0; i--) {
            answer += split[i];
        }
        return answer;
    }
}