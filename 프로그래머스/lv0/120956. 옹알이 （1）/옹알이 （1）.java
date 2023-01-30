import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String a = "aya"; 
        String b = "ye";
        String c = "woo";
        String d = "ma";    

        List<String> rest = new ArrayList<>();
        rest.add(a);
        rest.add(b);
        rest.add(c);
        rest.add(d);
        
        
        int qq =0;
        for (String word : babbling) { //
            qq =0;
            for (String restWord : rest) {   // 들어옴
                word = word.replace(restWord, "p");
            }

            for (int i = 0; i < word.length() ; i++) {

                char c1 = word.charAt(i);
                if (c1=='p'){
                  qq++;
                }
            }
            if (word.length()==qq){
                answer++;
            }
        }
        return answer;
    }
}