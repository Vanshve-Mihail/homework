import java.util.Scanner;
public class list {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        int start = Math.min(num1, num2);
        for (int i = start; ; i += start) {
            int square = i * i;
            System.out.println(square);
            if (square >= Math.max(num1, num2) * Math.max(num1, num2)) {
                break;
            }
        }
    }
}
