import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public List<Integer> solution(int n) {
            List<Integer> answer = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                answer.add(i);
                n /= i;
            }
        }
        List<Integer> collect =answer.stream().distinct().collect(Collectors.toList());
        return collect;
    }
}