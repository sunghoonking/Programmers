class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int w =0;
        int e =0;
        for(int i =0; i < sides.length;i++){
            if(sides[i] > w){
                w = sides[i];
                e = i;
            }
        }    
        sides[e] = 0;
        int qq = 0;
        for(int q:sides) {
           qq += q;
        }
        if(qq>w){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}