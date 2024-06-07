import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
         List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = arr1[i];
            int b = arr2[i];
            String binaryStringA = Integer.toBinaryString(a);
            String binaryStringB = Integer.toBinaryString(b);
            String A = makeBinaryString(n, binaryStringA);
            String B = makeBinaryString(n, binaryStringB);

            listA.add(A);
            listB.add(B);
        }

        String c = "";
        for (int i = 0; i < n; i++) {
            String a = listA.get(i);
            String b = listB.get(i);
            for (int j = 0; j < a.length(); j++) {
                int A = a.charAt(j);
                int B = b.charAt(j);
                if (A+B==96){
                    c+=" ";
                }else {
                    c+="#";
                }
            }
            answer[i] = c;
            c = "";
        }
        
        
        return answer;
    }
    
        private  String makeBinaryString(int n, String binaryString) {
        if (binaryString.length() < n){
            int length = n - binaryString.length();
            for (int e = 0; e < length; e++) {
                binaryString = "0" + binaryString;
            }
        }

        return binaryString;
    }
}