class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
            
        int a = 0;
        for (int i = 0; i < array.length; i++) {;
            if (a < array[i]){
                a = array[i];
                answer[0] = a;
                answer[1]  =i;
            }
            
        }
      
        return answer;
    }
}