class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
               if (A.equals(B)){

            return answer;
        }
        while (true) {
            if (answer>A.length()){
                answer=-1;
                break;
            }
            String s = arrayToString(A);
            answer++;
            A = s;
            if (s.equals(B)){
                break;
            }
        }
        
        return answer;
    }
    
      public static String arrayToString(String A){
        String[] split = A.split("");
        String a = "";
        String s = split[split.length - 1];
        for (int i = split.length-1; i >0 ; i--) {
            split[i] = split[i-1];
        }
        split[0] = s;
        for (int i = 0; i < split.length ; i++) {
            a+=split[i];
        }

        return a;
    }
}