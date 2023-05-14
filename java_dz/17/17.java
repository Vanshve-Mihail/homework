import java.util.Scanner;
public class RefactorLineTask17 {
    public static String GetLineTask17() {
        Scanner in = new Scanner(System.in);
        System.out.println();
        return in.nextLine();
    }
    public static boolean RefactorMethod(String line) {
        int countOpen = 0;
        int countClose = 0;
        for (int i = 0; i < line.length();  i++) {
            if (line.charAt(i) == '(') {
                countOpen += 1;
            } else if (line.charAt(i) == ')') {
                countClose += 1;
            }
        }
        return countClose == countOpen;
    }
    public static void Refactor() {
        System.out.println(RefactorMethod(GetLineTask17()));
    }
}
