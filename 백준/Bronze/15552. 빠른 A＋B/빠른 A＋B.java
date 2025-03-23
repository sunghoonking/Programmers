
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] agrs) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(bf.readLine());
        StringTokenizer split;
        for (int i = 0; i < num; i++) {
            split = new StringTokenizer(bf.readLine());
            bw.write(Integer.parseInt(split.nextToken()) + Integer.parseInt(split.nextToken()) + "\n");
        }
        bw.close();

    }

}