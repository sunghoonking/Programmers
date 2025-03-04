

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Map<String, Integer> map = new HashMap<>();
        String[] split = input.split("");
        for (String key : split) {
            String upperCaseKey = key.toUpperCase();
            if (map.containsKey(upperCaseKey)) {
                map.put(upperCaseKey, map.get(upperCaseKey) + 1);
            } else {
                map.put(upperCaseKey, 1);
            }
        }
        int value = 0;
        String answer = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (value == entry.getValue()) {
                answer = "?";
            }
            if (value < entry.getValue()) {
                value = entry.getValue();
                answer = entry.getKey().toUpperCase();
            }
        }
        System.out.println(answer);
        br.close();
    }
}
