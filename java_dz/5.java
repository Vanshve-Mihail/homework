import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int length = scanner.nextInt();

        int[] numbers = new int[length];
        System.out.print("Введите числа массива: ");
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sumSquares = 0;
        for (int i = 0; i < length; i++) {
            sumSquares += numbers[i] * numbers[i];
        }

        System.out.println("Сумма квадратов: " + sumSquares);
    }
}
