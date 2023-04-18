class Solution {
    public String[] solution(String my_str, int n) {
        int a = 0;
        int b = n;
        int index = 0;
        if(my_str.length()%n ==0){
            index = my_str.length() / n;
        }else {
            index = my_str.length() / n + 1;
        }
        String[] answer= new String[index];
        for (int i = 0; i < index; i++) {
            if (b > my_str.length()){
                b= my_str.length();
            }
            String substring = my_str.substring(a, b);
            answer[i] = substring;
            a += n;
            b += n;
        }
        return answer;
    }
}