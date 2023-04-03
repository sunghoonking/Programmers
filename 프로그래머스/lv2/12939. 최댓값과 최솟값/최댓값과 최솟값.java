import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split(" ");
        int[] w = new int[a.length];
        for (int i = 0; i <a.length; i++) {
            w[i] = Integer.parseInt(a[i]);
        }
        Arrays.sort(w);
        String s1 = String.valueOf(w[0]);
        String s2 = String.valueOf(w[a.length - 1]);
        answer = s1  + " " + s2;
        return answer;
    }
}