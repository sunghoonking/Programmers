import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] common) {

        int answer =0;
       
        int size = common.length-1;
    
        int lastIndex = common[size];

        int minus =  common[1]- common[0];
        int minus2 = common[2] - common[1];
        int as = 0;
        
        if(minus==minus2){
            as=minus;
            answer = lastIndex+as;
        }else{
            as = common[1]/common[0];
            answer = lastIndex*as;
        }
        
        return answer;
    }
}
