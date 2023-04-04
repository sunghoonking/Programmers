class Solution {
    public int[] solution(int[] emergency) {

                int[] answer = new int[emergency.length];
        int[] clone = emergency.clone();
        for (int i = 0; i <emergency.length; i++) {
            for (int j = i+1; j < emergency.length; j++) {
                if(emergency[i] < emergency[j]){
                    int temp = emergency[i];
                    emergency[i]= emergency[j];
                    emergency[j] = temp;
                }
            }
        }
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (clone[i] == emergency[j]){
                    answer[i]= j+1;
                }
            }
        }
        return answer;
    }
}