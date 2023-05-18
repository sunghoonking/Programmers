class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] strArr = polynomial.split(" +");
        int strNum = 0;
        int num = 0;

        for (String s : strArr) {
            if (s.equals("x")) {
                strNum += 1;
            } else if (s.contains("x")) {
                strNum += Integer.parseInt(s.substring(0, s.length() - 1));
            } else if (!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }

        if (strNum != 0 && num == 0) {
            if (strNum == 1) {
                answer = "x";
            } else {
                answer = strNum + "x";
            }
        } 

        if (strNum != 0 && num != 0) {
            if (strNum == 1) {
                answer = "x" + " + " + num;
            } else {
                answer = strNum + "x" + " + " + num;
            }
        }

        if (strNum == 0 && num != 0) {
            answer = String.valueOf(num);
        }

        return answer;
    }
}

//        String answer1 ="";
//        int a = 0;
//        int b = 0;
//        String[] q = polynomial.split(" ");
//        for (int i = 0; i <q.length; i++) {
//            String s1 = q[i];
//            if (s1.contains("x")){
//                String x = s1.replaceAll("x", "");
//                if (x.equals("")){
//                    a+=1;
//                }else {
//                    a+= Integer.parseInt(x);
//                }
//            } else if (s1.matches("[1-9]+")) {
//                b+=Integer.parseInt(s1);
//            }
//        }
//        String first = (a) + "x";
//        String second = String.valueOf(b);
//        if (a==1){
//            first = "x";
//        } else if (a==0) {
//            first = "0" +"x";
//        }
//        if (a!=0 && b!=0){
//            answer1 = first + " + " + second;
//        }else if (a==0){
//            answer1 = second;
//        }
//        else if (b==0){
//            answer1 = first;
//        }
//        System.out.println(answer1);