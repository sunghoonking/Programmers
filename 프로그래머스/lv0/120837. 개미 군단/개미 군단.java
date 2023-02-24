class Solution {
    public int solution(int hp) {
   int answer = 0;
     

        int q = hp/5;
        int i = hp % 5;
     

        int t = i/3;
        int w = i%3;

    
        int b = t/1;
     
     
        answer  = q + w + b;
    
        
        
        
        return answer;
    }
}