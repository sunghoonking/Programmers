class Solution {
    public String solution(String s) {
    
        String answer= "";
             int index =0;
        for (int i = 0; i < s.length(); i++) {
            String value = String.valueOf(s.charAt(i));
            if (value.equals(" ")){
                answer += value;
                index = 0;
            } else {
                if (index%2==0){
            answer += value.toUpperCase();
        }else {
            answer += value.toLowerCase();
                }
                index++;
            }
        }
        return answer;
    }
}