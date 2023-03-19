import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int n) {
        int[] answer = {};
        List<Integer> a = new ArrayList<>();
        for(int i = 1; i<=n;i++){
            if(n%i==0){
                a.add(i);
            }
        }
        return a;
    }
}