import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите интервалы через тире: ");
        String input = scanner.nextLine().trim();

        int count;
        count = calculateCount(input);
        System.out.println("Интервал: " + count);
    }

    private static int calculateCount(String input) {
        int count = 0;

        String[] intervals = input.split(",");
        for (String interval : intervals) {
            int[] arr = parseInterval(interval);
            count += (arr[1] - arr[0]);
        }

        return count;
    }

    private static int[] parseInterval(String interval) throws IllegalArgumentException {
        interval = interval.trim();
        if (!interval.matches("\\d+\\s*\\-\\s*\\d+")) {
            throw new IllegalArgumentException("Ошибка: " + interval);
        }

        String[] parts = interval.split("-");
        int start = Integer.parseInt(parts[0].trim());
        int end = Integer.parseInt(parts[1].trim());

        if (start > end) {
            throw new IllegalArgumentException("Ошибка: " + interval);
        }

        return new int[] {start, end};
    }
}
