import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        HistoryManager historyManager = new HistoryManager();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите уравнение (или \"история\"): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("история")) {
                break;
            }

            try {
                double result = calculator.calculate(input);
                System.out.println("Результат: " + result);
                historyManager.saveEquation(input, result);
            } catch (Exception e) {
                System.out.println("Ошибка при вычислении уравнения: " + e.getMessage());
            }
        }
        System.out.println("История ранее посчитанных уравнений:");
        historyManager.displayHistory();
        System.out.println("Программа завершена.");
    }
}
