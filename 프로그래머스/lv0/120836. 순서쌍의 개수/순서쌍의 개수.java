import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> a = new ArrayList<>();
         for(int i=1;i<=n;i++){
            if(n%i==0){
                a.add(i);
            }
        }
        
      for(int w = 0;w<a.size();w++){
            for(int ww = a.size()-1; ww>=0;ww--){
                if(a.get(w)*a.get(ww)==n){
                    answer++;
                }
            }
        }
        return answer;
    }
}