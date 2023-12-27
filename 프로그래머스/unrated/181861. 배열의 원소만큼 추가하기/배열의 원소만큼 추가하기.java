class Solution {
      public int[] solution(int[] arr) {
        int[] answer = {};

        int sum = 0;

		// arr의 각 인덱스의 합 = 반환할 인덱스의 길이
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];    
        }
        answer = new int[sum];

        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[idx++] = arr[i];
            }
        }

        return answer;
    }

}