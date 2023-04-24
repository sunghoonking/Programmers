import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
         
        Arrays.sort(sides);
        int small = sides[0];
        int big = sides[1];
        int key = small + big;
        while (true){
            if (key <= big && key+ small > big){
                answer++;
            }
            if (key> big&& small+big>key){
                answer++;
            }
            if (key == 0){
                break;
            }
            key--;
        }

        return answer;
    }
}