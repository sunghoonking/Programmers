class Solution {
    public int solution(int n) {
        int a= 1;
        int b =1;
        while (true){
            if (a==n){
                break;
            }
            a++;
            b++;
            b = three(b);
        }
        return b;
    }
    
        public static int three(int b){
        String s = String.valueOf(b);
        if (b%3!=0 && !s.contains("3")){
            return b;
        }
        if (b%3==0 || s.contains("3")){
            b++;
        }
        return three(b);
    }
}