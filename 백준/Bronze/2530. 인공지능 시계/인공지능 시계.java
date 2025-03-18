
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력 받기
        Scanner scanner = new Scanner(System.in);
        String timeString = scanner.nextLine();
        String[] split = timeString.split(" ");
        LocalTime time = LocalTime.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));

        // 초 입력 받기
        String second = scanner.next();
        LocalTime localTime = time.plusSeconds(Integer.parseInt(second));

        // 시간을 "H m s" 형식으로 출력
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H m s");
        String formattedTime = localTime.format(formatter);

        // 출력
        System.out.println(formattedTime);
    }
}
