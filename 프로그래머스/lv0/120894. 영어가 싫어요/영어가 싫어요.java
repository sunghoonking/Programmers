import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        Map<String, Integer> number = new HashMap<>();
        number.put("zero",0);
        number.put("one",1);
        number.put("two",2);
        number.put("three",3);
        number.put("four",4);
        number.put("five",5);
        number.put("six",6);
        number.put("seven",7);
        number.put("eight",8);
        number.put("nine",9);
        String answers = "";
        for (Entry<String, Integer> map: number.entrySet()) {
            if (numbers.contains(map.getKey())){
                answers= numbers.replace(map.getKey(), String.valueOf(map.getValue()));
                numbers = answers;

            }
        }
        answer = Long.parseLong(answers);
        
        return answer;
    }
}