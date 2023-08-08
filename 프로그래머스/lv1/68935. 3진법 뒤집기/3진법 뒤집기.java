class Solution {
    public int solution(int n) {
        int answer = 0;
                String three = "";
        while (true){
            int remainder = n % 3;
            int share = n/3;
            three += remainder;
            n = n/3;
            if (share==0){
                break;
            }
        }
        int index = 0;
        for (int i = three.length()-1; i >=0 ; i--) {
            int key = three.charAt(index) - '0';
            double v = key * Math.pow(3, i);
            answer += v;
            index++;
        }
        return answer;
    }
}