class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
    
        int a = n/slice;

        int b = n%slice;
        
        if(b==0){
         answer = a;   
        }else{
         answer = a+1;
        }
        
        return answer;
    }
}