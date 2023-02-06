class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        
        answer = new int[strlist.length];
        int a = 0;
        for(String q : strlist){
            
            answer[a] = q.length();
            a++;
        }
        return answer;
    }
}