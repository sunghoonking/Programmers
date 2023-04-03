class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
int temp = 101;
        for (int i = 0; i <array.length ; i++) {
            int abs = Math.abs(n - array[i]);
            if (abs==0){
                answer= array[i];
                break;
            } else if (abs <temp ) {
                temp = abs;
                answer = array[i];
            } else if (abs == temp && array[i] < answer) {
                answer= array[i];
            }
        }
        return answer;
    }
}