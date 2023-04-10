import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите N: ");
        int N = input.nextInt();

        System.out.print("Введите первый делитель: ");
        int divisor1 = input.nextInt();

        System.out.print("Введите второй делитель: ");
        int divisor2 = input.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % divisor1 == 0 || i % divisor2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
