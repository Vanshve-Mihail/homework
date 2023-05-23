import java.math.BigInteger;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1;
        String num2;
        do {
            System.out.print("Введите первое число: ");
            num1 = scanner.next();
            System.out.print("Введите второе число: ");
            num2 = scanner.next();
        } while (!isPositive(num1) || !isPositive(num2));

        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger sum = a.add(b);

        System.out.println("Сумма: " + sum);
    }

    private static boolean isPositive(String num) {
        int n = Integer.parseInt(num);
        if (n < 0) {
            System.out.println("Число не положительное");
        }
        return n > 0;
    }
}
