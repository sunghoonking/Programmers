
    import java.util.*;
    import java.util.stream.IntStream;

    public class Main{
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int[][] arr = new int[9][9];

            int max = 0;
            int x = 0;
            int y = 0;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                int next = Integer.parseInt(in.next());
                if (next > max) {
                    max = next;
                    x=i;
                    y=j;
                }
                arr[i][j] = next;
                }
            }
            x+=1;
            y+=1;
            System.out.println(max);
            System.out.println(x + " " +y);


        }
    }