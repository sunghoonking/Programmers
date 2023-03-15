class Solution {
    public String solution(int age) {
        String answer = "";
                String[] a = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z"};
        String aa = String.valueOf(age);
        String[] split = aa.split("");

        for (int j = 0; j <split.length ; j++) {
            int key = Integer.parseInt(split[j]);
            for (int i = 0; i < a.length; i++) {
                if(i == key){
                    answer += a[i];
                }
            }
        }
        return answer;
    }
}