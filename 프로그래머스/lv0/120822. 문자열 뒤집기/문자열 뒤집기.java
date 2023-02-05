class Solution {
    public String solution(String my_string) {
        String answer = "";
        char [] a = new char[my_string.length()];
        int q = 0;
        for(int i =my_string.length()-1; i >= 0; i--){
            char c = my_string.charAt(i);
            a[q] = c;
            q++;
        }
        answer = String.valueOf(a);
    
        return answer;
    }
}