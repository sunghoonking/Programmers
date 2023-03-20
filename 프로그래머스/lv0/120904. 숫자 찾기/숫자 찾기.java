class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String a = String.valueOf(num);
        for (int i = 0; i <a.length(); i++) {
            int w  = a.charAt(i)- '0';
            if (k==w){
                answer = i+1;
                break;
            }

        }
        return answer;
    }
}