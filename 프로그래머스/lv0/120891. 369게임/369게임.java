class Solution {
    public int solution(int order) {
        int answer = 0;
        
         String a = String.valueOf(order);
        
        for(int i= 0; i <a.length(); i++){
            int q = a.charAt(i) -'0';
            if(q==3 || q==6 || q==9){
                answer ++;
            }
        }
        return answer;
    }
}