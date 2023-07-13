import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
               int length = arr.length;
        int[] answer;
        if (length==1){
            answer= new int[]{-1};
        }else {
            answer = new int[length-1];
            int[] clone = Arrays.copyOf(arr, length);
            Arrays.sort(arr);
            int min = arr[0];
            int index = 0;
            for (int j = 0; j < length; j++) {  // 0 ~ 4
                if (min!=clone[j]){
                    answer[index] = clone[j];
                    index++;
                }
            }
        }
        return answer;
    }
}