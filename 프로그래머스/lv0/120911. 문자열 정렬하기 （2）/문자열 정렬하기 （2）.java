import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String s = my_string.toLowerCase();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
         answer = String.valueOf(chars);
        return answer;
    }
}