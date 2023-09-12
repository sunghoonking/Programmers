class Solution {
    public int[] solution(int[] arr) {
  
                int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            int value = arr[i];
            if (value>=50 && value%2 ==0){
                value /= 2;
            } else if (value<50 && value%2!=0) {
                value *= 2;
            }
            answer[i] = value;
        }
        return answer;
    }
}