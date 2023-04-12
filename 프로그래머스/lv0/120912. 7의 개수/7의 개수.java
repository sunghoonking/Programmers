class Solution {
    public int solution(int[] array) {
        int answer = 0;
    for (int i = 0; i < array.length; i++) {
            String s = String.valueOf(array[i]);
            for (int j = 0; j < s.length(); j++) {
                int i1 = s.charAt(j) - '0';
                if(i1==7){
                    answer++;
                }
            }
        }
        return answer;
    }
}