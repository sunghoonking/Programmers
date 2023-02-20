class Solution {
    public int solution(int n) {
        int answer = 0;
        
            
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            int i1 = str.charAt(i) - '0';
            answer += i1;
        }
        
        
        
        return answer;
    }
}