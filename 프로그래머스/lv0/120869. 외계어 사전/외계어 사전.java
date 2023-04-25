import java.util.Arrays;
class Solution {
    public int solution(String[] spell, String[] dic) {
    
int answer = 2;
        String key = "";
        Arrays.sort(spell);
        for (String a:spell) {
            key+=a;
        }
        for (int i = 0; i < dic.length; i++) {
            char[] chars = dic[i].toCharArray();
            Arrays.sort(chars);
            if (String.valueOf(chars).equals(key)){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}