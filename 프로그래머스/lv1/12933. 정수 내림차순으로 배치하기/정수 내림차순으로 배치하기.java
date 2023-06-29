class Solution {
    public long solution(long n) {
        long answer = 0;
                String a = String.valueOf(n);
        long[] arr = new long[a.length()];
        for (int i = 0; i < a.length(); i++) {
            arr[i] = a.charAt(i) - '0';
        }
        for (int i = arr.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j]<arr[j+1]){
                    long temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        String w = "";
        for (int i = 0; i < arr.length; i++) {
            w += arr[i];
        }
        answer = Long.parseLong(w);

        return answer;
    }
}