class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        for(int i = code; i < cipher.length()+1; i++){
            if(i%code==0){
                char c = cipher.charAt(i-1);
                answer += c;
            }
            
        }
        return answer;
    }
}