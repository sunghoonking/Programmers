import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        if( down(dots[0],dots[1]) == down(dots[2],dots[3])){
            return 1;
        }
           if( down(dots[0],dots[2]) == down(dots[1],dots[3])){
            return 1;
        }
              if(down(dots[0],dots[3])== down(dots[1],dots[2])){
            return 1;
        }
                 
        return answer;
    }
    public double down(int[] a , int[] b){
        double x = a[0];
        double y = a[1];
        
        double x1 = b[0];
        double y1 = b[1];
        double dou  = (x1-x) / (y1-y);
        return dou;
    }
}