class Solution {
    public String solution(String phone_number) {
        String answer = "";
                String[] split = phone_number.split("");
        
        int length = split.length;
        for (int i = 0; i < split.length; i++) {
            if (length>4){
            split[i] = "*";
        }
        answer += split[i];
        length--;
    }
        return answer;
    }
}