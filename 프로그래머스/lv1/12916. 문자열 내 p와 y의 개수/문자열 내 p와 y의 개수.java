import java.util.ArrayList;
import java.util.List;

class Solution {
    boolean solution(String s) {
      boolean answer = false;
        String e = s.toUpperCase();
        int p = 0;
        int y = 0;
        String[] split = e.split("");
        for (int i = 0; i <s.length() ; i++) {
            String a = split[i];
            if (a.equals("P")){
                p++;
            }
            if (a.equals("Y")){
                y++;
            }
        }
        if (p==0&y==0 ||p==y){
            answer= true;
        }
        return answer;
    }
}