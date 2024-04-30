import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Solution {
    public int[] solution(int[] numbers) {
        
               List<Integer> a= new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int i1 = numbers[i] + numbers[j];
                a.add(i1);
            }
        }
int[] answer = a.stream().distinct().collect(Collectors.toList()).stream().sorted().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}