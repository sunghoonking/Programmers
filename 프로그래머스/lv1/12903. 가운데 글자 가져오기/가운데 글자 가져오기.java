class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        if(length%2==0){
        int index = length/2-1;
        answer =  String.valueOf(s.charAt(index)) + String.valueOf(s.charAt(index+1));;
        }else {
            int index = length/2;
            answer = String.valueOf(s.charAt(index));
        }
        return answer;
    }
}