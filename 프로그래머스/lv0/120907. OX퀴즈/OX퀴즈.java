class Solution {
    public String[] solution(String[] quiz) {
                String[] answer = new String[quiz.length];

        int value = 0;
        for (int i = 0; i < quiz.length; i++) {
            String formula = quiz[i];
            String[] arr = formula.split(" ");
            String num1 = arr[0];
            String arithmetic = arr[1];
            String num2 = arr[2];
            if (arithmetic.equals("+")){
                value = Integer.parseInt(num1) + Integer.parseInt(num2);
            }
            else {
                 value = Integer.parseInt(num1) - Integer.parseInt(num2);
            }
            if (value == Integer.parseInt(arr[arr.length-1])){
                answer[i] = "O";
            }else {
                answer[i] = "X";
            }
        }
        return answer;
    }
}