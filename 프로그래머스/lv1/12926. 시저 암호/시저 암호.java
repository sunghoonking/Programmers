class Solution {
    public String solution(String s, int n) {
         String answer = "";
       for (int i = 0; i <s.length() ; i++) {
            char al = s.charAt(i);
            if (String.valueOf(al).equals(" ")){
                answer+= al;
            }else {
                char c = checkAlphabet(al, n);
                answer+= c;
            }
        }
       return answer;
    }
    public static char checkAlphabet(char c,int n){
        // 대소문자체크
        // 합이 90(대문자) , 122(소문자) 넘는지 체크
        // 넘으면 -25 아니면 그대로
        int key = c + n;
        char a = '0';
        if (Character.isUpperCase(c) && key>90){
             a = (char) (key-26);
        } else if (Character.isLowerCase(c) && key>122){
             a = (char) (key-26);
        }else {
             a = (char) (key);
        }
        return a;
    }

    }
