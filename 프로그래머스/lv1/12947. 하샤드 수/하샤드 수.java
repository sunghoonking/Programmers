class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String s = String.valueOf(x);
        int a = 0;
        for (int i = 0; i <s.length() ; i++) {
            a+= s.charAt(i) - '0';
        }
        if (x%a==0){
            answer = true;
        }
        return answer;
    }
}