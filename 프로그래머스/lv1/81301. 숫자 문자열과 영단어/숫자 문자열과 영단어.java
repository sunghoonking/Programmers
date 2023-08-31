
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int solution(String s) {
        int answer = 0;
                String an = "";
        Map<String, String> map = new HashMap<>();
        map.put("nine", "9");
        map.put("eight", "8");
        map.put("seven", "7");
        map.put("six", "6");
        map.put("five", "5");
        map.put("four", "4");
        map.put("three", "3");
        map.put("two", "2");
        map.put("one", "1");
        map.put("zero", "0");

        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' > 10) {
                temp += String.valueOf(s.charAt(i));
            } else {
                an+= s.charAt(i)-'0';
                continue;
            }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String entryValue = entry.getValue();
            if (temp.equals(key)){
                an+= entryValue;
                temp="";
            }
         }
        }
answer = (int) Long.parseLong(an);

        return answer;
    }
}