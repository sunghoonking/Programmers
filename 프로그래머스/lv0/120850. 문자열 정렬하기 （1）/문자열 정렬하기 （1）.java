
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class Solution {
    public List<Integer> solution(String my_string) {
        int[] answer = {};
        
      List<Integer> w = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++){
                char a = my_string.charAt(i);
                int e = a-'0';
                if (e<10){
                    w.add(e);
                }
            };
         w.sort(Integer::compareTo);

        return w;
    }
}