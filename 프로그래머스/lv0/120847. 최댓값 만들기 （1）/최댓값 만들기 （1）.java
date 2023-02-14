import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int q = numbers.length-1;
        Arrays.sort(numbers);
        answer = numbers[q]*numbers[q-1];
        
        return answer;
    }
}