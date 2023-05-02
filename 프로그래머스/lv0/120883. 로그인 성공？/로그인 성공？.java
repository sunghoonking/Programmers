class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
                String id = id_pw[0];
        String pw = id_pw[1];

        for (int i = 0; i <db.length; i++) {
            String neWid = db[i][0];
            String neWpw = db[i][1];
            if (id.equals(neWid) && pw.equals(neWpw)){
                answer = "login";
                break;
               }
            else if (id.equals(neWid) && !pw.equals(neWpw)){
                answer = "wrong pw";
                break;
            }
            else {
                answer = "fail";
            }
        }
        return answer;
    }
}