class Solution {
    public String solution(String my_string) {
        String answer = "";
        
            for (int i = 0; i <my_string.length() ; i++) {
        char c = my_string.charAt(i);
        if (Character.isLowerCase(c)){
            char c1 = Character.toUpperCase(c);
            answer += c1;
        } else{
            char c1 = Character.toLowerCase(c);
            answer += c1;
        }

    }
        
        return answer;
    }
}