class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
    for (int l = i; l < j+1 ; l++) {
            String s = String.valueOf(l);
            String s1 = String.valueOf(k);
            if (s.contains(s1)){
                for (int m = 0; m <s.length() ; m++) {
                    int i1 = s.charAt(m) - '0';
                    if (i1==k){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}