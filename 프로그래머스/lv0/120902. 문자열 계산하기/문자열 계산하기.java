class Solution {
    public int solution(String my_string) {
        
     
        String[] split = my_string.split(" ");
        int answer = Integer.parseInt(split[0]);
        for (int i = 1; i <split.length-1; i++) {
            if (split[i].equals("+")) {
                int back = Integer.parseInt(split[i+1]);
                answer += back;
            } else if (split[i].equals("-")) {;
                int back = Integer.parseInt(split[i+1]);
               answer-= back;
            }
        }
        return answer;
    }
}