class Solution {
    public String solution(String rsp) {
        String answer = "";
        int a = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <rsp.length() ; i++) {
            char c = rsp.charAt(i);
            if (c-'0'==2){
                a = 0;
            }else if (c-'0'==0){
                a = 5;
            }else {
                a = 2;
            }
            stringBuilder.append(a);
        }
        answer = String.valueOf(stringBuilder);
        return answer;
    }
}