import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int n, int[] numlist) {
        int[] answer = {};
        
        
        List<Integer> a = new ArrayList<>();
        for(int i:numlist){
            if(i%n==0){
                a.add(i);
            }
        }
        
        return a;
    }
}