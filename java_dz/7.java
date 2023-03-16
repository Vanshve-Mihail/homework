import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = input.nextInt();
        int cl = Integer.MAX_VALUE;
        int number = 0;
        for (int i = 0; i <= n; i++) {
            int difference = Math.abs((i * i) - n);
            if (difference < cl) {
                cl = difference;
                number = i;
            }
        }
        System.out.println("Ближайщий квадрат числа "+ number);
    }
}
