

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        List<String> array = new ArrayList<>();
        List<String> array2 = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            String str = scanner.next();
            array.add(str);
            String[] split = str.split("");
            for (int j = 0; j < col; j++) {
                String s = split[j];
                if (array2.size() > j) {
                    array2.set(j, array2.get(j) + s);
                } else {
                    array2.add(s);
                }
            }
        }
        int rowCount = 0;
        for (int i = 0; i < array.size(); i++) {
            if (!array.get(i).contains("X")){
                rowCount++;
            }
        }
        int colCount = 0;
        for (int i = 0; i < array2.size(); i++) {
            if (!array2.get(i).contains("X")){
                colCount++;
            }
        }
        System.out.println(Math.max(rowCount, colCount));
    }
}