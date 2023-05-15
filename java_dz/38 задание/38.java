import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String input = scanner.nextLine();

        input = input.replaceAll("[^\\p{L}\\s]+", "");

        String[] words = input.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.substring(1)).append(word.charAt(0)).append("ауч ");
        }

        System.out.println(sb.toString().trim());
    }
}
