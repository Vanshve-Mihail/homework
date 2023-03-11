import java.util.Scanner;

public class dz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        System.out.print("Введите символ: ");
        char c = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("Символ" + c + " встречается " + count + " раз");
    }
}
