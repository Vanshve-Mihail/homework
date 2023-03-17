import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите стартовое число: ");
        int start = input.nextInt();
        System.out.print("Введите шаг: ");
        int step = input.nextInt();
        System.out.print("Введите кол-во шагов: ");
        int numSteps = input.nextInt();
        for (int i = 0; i < numSteps; i++) {
            int num = start + i * step;
            System.out.print(num + " ");
        }
    }
}
