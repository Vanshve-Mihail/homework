import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = input.nextLine();
        String result = str.replaceAll("[АУОЫИЭЯЮЕауоыиэяюе]", "");
        System.out.println(result);
    }
}
