import java.util.LinkedHashMap;

import java.util.List;
import java.util.Map;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
          String answer = "Yes";
        LinkedHashMap<String, Integer> cardMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goalMap = new LinkedHashMap<>();
        for (int i = 0; i < cards1.length; i++) {
            cardMap.put(cards1[i], 10 + i);
        }
        for (int i = 0; i < cards2.length; i++) {
            cardMap.put(cards2[i], 20 + i);
        }

        for (int i = 0; i < goal.length; i++) {
            if (cardMap.get(goal[i]) == null) {
                answer = "No";
                break;
            }
            goalMap.put(goal[i], cardMap.get(goal[i]));
        }
        for (int i = 0; i <= goal.length; i++) {
            if (i + 1 >= goal.length) {
                break;
            }
            int current = goalMap.get(goal[i]);
            int next = goalMap.get(goal[i + 1]);
            if (current > next) {
                // 20보다 크거나 같고 30보다 작음
                if (current >= 20 && current < 30 && next >= 20 && next < 30) {
                        answer = "No";
                        break;
                // 10보다 크거나 같고 20보다 작음
                }
                else if (current >= 10 && current < 20 && next >= 10 && next < 20) {
                        answer = "No";
                        break;
                }
            }
            if (current < next) {
                if (current >= 20 && current < 30 && next >= 20 && next < 30) {
                    if (next - current != 1) {
                        answer = "No";
                        break;
                    }
                }
                else if (current >= 10 && current < 20 && next >= 10 && next < 20) {
                    if (next - current != 1) {
                        answer = "No";
                        break;
                    }
                }
            }
        }
        return answer;
    }
}