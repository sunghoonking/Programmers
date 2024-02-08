import java.util.ArrayList;
import java.util.List;
class Solution {
    public String solution(int[] food) {
   // 인덱스 2번쨰 부터 2로 나눴을 때 나머지가
        List<Integer> a= new ArrayList<>();
        for (int i = 1; i <food.length ; i++) {
            int count = food[i];
            int remain = count / 2;
            a.add(remain);
        }
        // 1/2/3;
        int num = 1;
        String temp = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <a.size() ; i++) {
            Integer integer = a.get(i);
            for (int j = 0; j < integer; j++) {
                stringBuilder.append(num);
            }
            num++;
        }
        temp = String.valueOf(stringBuilder);
        StringBuilder reverse = stringBuilder.reverse();
        String answer = temp + "0" + reverse;
        
        return answer;
    }
}