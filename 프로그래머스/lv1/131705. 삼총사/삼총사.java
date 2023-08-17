class Solution {
    public int solution(int[] number) {
        int answer = 0;
                for (int i = 0; i < number.length ; i++) {
            for (int j = i+1; j < number.length; j++) {
                for (int k = j+1; k < number.length; k++) {
                    int i1 = number[i];
                    int i2 = number[j];
                    int i3 = number[k];
                    if (i1+i2+i3 ==0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}