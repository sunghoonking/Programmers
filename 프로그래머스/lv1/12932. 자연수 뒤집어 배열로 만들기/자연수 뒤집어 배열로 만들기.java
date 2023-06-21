class Solution {
    public int[] solution(long n) {
                String num = String.valueOf(n);
        int[] answer = new int[num.length()];
        int j = num.length()-1;
        for (int i = 0; i <num.length() ; i++) {
            int i1 = num.charAt(i) - '0';
            answer[j] = i1;
            j--;

        }
        return answer;
    }
}