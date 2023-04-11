import java.util.Stack;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] s1 = s.split(" ");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s1.length ; i++) {
            if (!s1[i].equals("Z")){
                stack.push(Integer.valueOf(s1[i]));
            }
            else {
                stack.pop();
            }
        }
        while (!stack.isEmpty()){
            Integer pop = stack.pop();
            answer += pop;
        }
        return answer;
    }
}