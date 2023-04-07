class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
    
        int i1 = Integer.parseInt(bin1,2);
        int i2 = Integer.parseInt(bin2,2);
        
        int i = i1 + i2;

        
        answer = Integer.toBinaryString(i);
        
        return answer;
    }
}