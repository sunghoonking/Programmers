import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
   String[] w = new String[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <s.length() ;i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(map.get(c)==1){;
                w[i] = String.valueOf(c);
            }else {
                w[i] = "";
            }
        }
            Arrays.sort(w);
            for (int i = 0; i <w.length ; i++) {
                answer+=w[i];
            }
        return answer;
    }
}