
import java.util.ArrayList;
import java.util.List;
class Solution {
            public int[] solution(String s) {
                int[] answer = {};
                answer = new int[s.length()];
                List<String> list = new ArrayList<>();
                for (int i = 0; i < s.length(); i++) {
                    String key = s.charAt(i) + "";
                    if (!list.contains(key)) {
                        answer[i] = -1;
                    }else {
                        answer[i] = i - list.lastIndexOf(key);
                    }
                    list.add(key);
                }
                
                return answer;
            }
        }