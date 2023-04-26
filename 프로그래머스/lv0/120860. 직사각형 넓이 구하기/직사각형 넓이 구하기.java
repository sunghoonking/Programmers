class Solution {
        public int solution(int[][] dots) {
        int answer = 0;
                    int x = dots[0][0];
        int y = dots[0][1];
        int height = 0;
        int width = 0;
        for (int i = 1; i < dots.length; i++) {
            int xx = dots[i][0];
            int yy = dots[i][1];
            if (x == xx){
                height = Math.abs(y - yy);
            }
            if (y==yy){
                width = Math.abs(x-xx);
            }
            answer = height*width;
        }
        return answer;
    }
}