import java.io.*;
import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите уравнение (или \"история\"): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("история")) {
                break;
            }

            try {
                double result = calculate(input);
                System.out.println("Результат: " + result);
                saveEquation(input, result);
            } catch (Exception e) {
                System.out.println("Ошибка при вычислении уравнения: " + e.getMessage());
            }
        }
        System.out.println("История ранее посчитанных уравнений:");
        displayHistory();
        System.out.println("Программа завершена.");
    }
    private static double calculate(String equation) throws Exception {
        equation = equation.replaceAll("\\s+", "");
        if (equation.isEmpty()) {
            throw new Exception("Пустое уравнение.");
        }
        return evaluateExpression(equation);
    }
    private static double evaluateExpression(String expression) throws Exception {
        if (expression.contains("|")) {
            int start = expression.indexOf("|") + 1;
            int end = expression.indexOf("|", start);
            double number = evaluateExpression(expression.substring(start, end));
            return Math.abs(number);
        } else if (expression.contains("^")) {
            int index = expression.indexOf("^");
            double base = evaluateExpression(expression.substring(0, index));
            double exponent = evaluateExpression(expression.substring(index + 1));
            return Math.pow(base, exponent);
        } else if (expression.contains("*")) {
            int index = expression.indexOf("*");
            double left = evaluateExpression(expression.substring(0, index));
            double right = evaluateExpression(expression.substring(index + 1));
            return left * right;
        } else if (expression.contains("/")) {
            int index = expression.indexOf("/");
            double left = evaluateExpression(expression.substring(0, index));
            double right = evaluateExpression(expression.substring(index + 1));
            return left / right;
        } else if (expression.contains("//")) {
            int index = expression.indexOf("//");
            double left = evaluateExpression(expression.substring(0, index));
            double right = evaluateExpression(expression.substring(index + 2));
            return (int) (left / right);
        } else if (expression.contains("%")) {
            int index = expression.indexOf("%");
            double left = evaluateExpression(expression.substring(0, index));
            double right = evaluateExpression(expression.substring(index + 1));
            return left % right;
        } else if (expression.contains("+")) {
            int index = expression.indexOf("+");
            double left = evaluateExpression(expression.substring(0, index));
            double right = evaluateExpression(expression.substring(index + 1));
            return left + right;
        } else if (expression.contains("-")) {
            int index = expression.indexOf("-");
            double left = evaluateExpression(expression.substring(0, index));
            double right = evaluateExpression(expression.substring(index + 1));
            return left - right;
        } else {
            return Double.parseDouble(expression);
        }
    }
    private static void saveEquation(String equation, double result) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("50z.txt", true));
            writer.write(equation + " = " + result);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении уравнения: " + e.getMessage());
        }
    }
    private static void displayHistory() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("50z.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Ошибка при чтении истории: " + e.getMessage());
        }
    }
}
