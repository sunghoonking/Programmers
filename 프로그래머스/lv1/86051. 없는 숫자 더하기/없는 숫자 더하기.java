class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int [] arr = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <numbers.length ; j++) {
                if (arr[i] == numbers[j]) {
                    arr[i] = 0;
                    break;
                }
            }
            answer+= arr[i];
        }

        return answer;
    }
}