class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        // int a = box[0] *box[1] *box[2];
        // int q = n*n*n;
        // answer = a/q;
        
// answer = box[0]/n *box[1]/n *box[2]/n;
    
answer =  (box[0]/n)*(box[1]/n)*(box[2]/n);
        return answer;
    }
}