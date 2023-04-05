class Solution {
    public int solution(String my_string) {
        int answer = 0;
    
         String[] numbers = my_string.replaceAll("[^0-9]", " ").split(" ");
    
        for (int i = 0; i <numbers.length; i++) {
            String number = numbers[i];
            if (!number.equals("")){
                int e = Integer.parseInt(number);
                answer += e;
            }
        }
    
        return answer;
    }
}