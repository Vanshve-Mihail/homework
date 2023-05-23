import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во лет: ");
        int num = scanner.nextInt();
        String romanYear = arabicToRoman(num);
        System.out.println("В перевод на римские цифры: " + romanYear);
    }

    private static String arabicToRoman(int num) throws IllegalArgumentException {
        if (num <= 0 || num >= 10000) {
            throw new IllegalArgumentException("Число не должно превыыщать 10000");
        }
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        StringBuilder sb = new StringBuilder();
        sb.append(thousands[num / 1000]);
        sb.append(hundreds[(num % 1000) / 100]);
        sb.append(tens[(num % 100) / 10]);
        sb.append(ones[num % 10]);

        return sb.toString();
    }
}
