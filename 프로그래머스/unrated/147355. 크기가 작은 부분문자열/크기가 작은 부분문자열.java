class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int a = p.length();
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String substring = t.substring(i, a);
            if (Long.parseLong(substring) <= Long.parseLong(p)){
                answer++;
            }
            a++;
        }
        return answer;
    }
}