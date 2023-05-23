import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во лет(римскими цифрами): ");
        String romanYear = scanner.nextLine();
        int num = romanToArabic(romanYear.toUpperCase());
        System.out.println("В арабских цифрах: " + num);
    }

    private static int romanToArabic(String romanYear) throws IllegalArgumentException {
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int num = 0, i = 0;
        romanYear = romanYear.replaceAll("\\s", "");
        while (i < romanYear.length()) {
            String currentSymbol = romanYear.substring(i, i + 1);
            int currentValue = getValue(symbols, values, currentSymbol);
            if (i + 1 < romanYear.length()) {
                String nextSymbol = romanYear.substring(i + 1, i+ 2);
                int nextValue = getValue(symbols, values, nextSymbol);
                if (nextValue > currentValue) {
                    num += (nextValue - currentValue);
                    i += 2;
                } else {
                    num += currentValue;
                    i++;
                }
            } else {
                num += currentValue;
                i++;
            }
        }

        if (num <= 0 || num >= 10000) {
            throw new IllegalArgumentException("Кол-во лет не должно превыщать 10000");
        }
        return num;
    }

    private static int getValue(String[] symbols, int[] values, String symbol) throws IllegalArgumentException {
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i].equals(symbol)) {
                return values[i];
            }
        }
        throw new IllegalArgumentException("Недопустимый символ: " + symbol);
    }
}
