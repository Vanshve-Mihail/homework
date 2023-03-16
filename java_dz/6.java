import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = input.nextInt();

        if (ddd(num)) {
            System.out.println(num + " простое");
        } else {
            System.out.println(num + " не простое");
        }
    }

    public static boolean ddd(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
