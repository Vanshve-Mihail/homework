import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String firstLine = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String secondLine = scanner.nextLine();
        boolean endsWith = firstLine.endsWith(secondLine);
        if (endsWith) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
