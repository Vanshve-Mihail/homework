import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество секунд: ");
        int seconds = scanner.nextInt();
        scanner.close();

        String result = calculateTime(seconds);
        System.out.println(result);
    }

    public static String calculateTime(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        String timeString = "";
        if (hours > 0) {
            timeString += hours + (hours == 1 ? " час" : " часа");
        }
        if (minutes > 0) {
            timeString += (timeString.isEmpty() ? "" : ", ") + minutes + (minutes == 1 ? " минута" : " минуты");
        }
        if (remainingSeconds > 0) {
            timeString += (timeString.isEmpty() ? "" : " и ") + remainingSeconds + (remainingSeconds == 1 ? " секунда" : " секунды");
        }

        return timeString;
    }
}
