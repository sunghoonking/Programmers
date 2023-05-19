import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
                Map<Integer, Integer> map = new HashMap<>();
        int value = 1;
        for (int key : array) {
            if (map.containsKey(key)) {
                Integer integer = map.get(key);
                integer++;
                map.put(key, integer);
            } else {
                map.put(key, value);
            }
        }
        int compare = 0;
        for (Entry<Integer, Integer> a:map.entrySet()) {
            if (a.getValue()>compare){
             compare = a.getValue();
             answer = a.getKey();
            }
        }
        map.remove(answer);
        if (map.containsValue(compare)){
            answer= -1;
        }
        return answer;
    }
}