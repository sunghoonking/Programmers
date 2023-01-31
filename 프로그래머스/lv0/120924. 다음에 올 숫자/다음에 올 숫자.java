import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] common) {

        int answer =0;
    
        List<Integer> arrayInteger = new ArrayList<>();
        for(int num: common){
            arrayInteger.add(num);
        }
        
        int size = arrayInteger.size()-1;
    
        int lastIndex = arrayInteger.get(size);
        
        
        
        int minus = arrayInteger.get(1)-arrayInteger.get(0);
        int minus2 = arrayInteger.get(2) - arrayInteger.get(1);
        int as = 0;
        if(minus==minus2){
            as=minus;
            answer = lastIndex+as;
        }else{
            as = arrayInteger.get(1)/arrayInteger.get(0);
            answer = lastIndex*as;
        }
        
    
        return answer;
    }
}