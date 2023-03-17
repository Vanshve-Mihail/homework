import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class convertCase {
    public static String removeRepeatingWords(String string) {
        String[] words = string.split("\\s+");
        List<String> nonRepeatingWords = new ArrayList<>();
        for (String word : words) {
            if (!nonRepeatingWords.contains(word)) {
                nonRepeatingWords.add(word);
            }
        }
        return String.join(" ", nonRepeatingWords);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = input.nextLine();
        String result = removeRepeatingWords(string);
        System.out.println(result);
    }
}
