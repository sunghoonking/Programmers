class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder(my_string);
        for (int i = 0; i <stringBuilder.length() ; i++) {
            for (int j = stringBuilder.length()-1; j  >= 0; j--) {
                if (i!=j && stringBuilder.charAt(i)==stringBuilder.charAt(j)){
                    stringBuilder.deleteCharAt(j);
                    j = stringBuilder.toString().length();
                }
            }
        }
        answer = stringBuilder.toString();
        return answer;
    }
}