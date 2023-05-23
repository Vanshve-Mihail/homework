import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[][] rows = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            String input = scanner.nextLine().trim();
            String[] parts = input.split("\\s+");
            int[] row = new int[parts.length];
            for (int j = 0; j < parts.length; j++) {
                row[j] = Integer.parseInt(parts[j]);
            }
            rows[i] = row;
        }
        int maxSlide = calculateMaxSlide(rows);
        System.out.println("Максимальная сумма: " + maxSlide);
    }

    private static int calculateMaxSlide(int[][] rows) {
        int n = rows.length;
        int[][] maxSums = new int[n][];
        for (int i = 0; i < n; i++) {
            maxSums[i] = new int[rows[i].length];
        }
        maxSums[0][0] = rows[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < rows[i].length; j++) {
                int leftSum = j > 0 ? maxSums[i - 1][j - 1] : 0;
                int rightSum = j < rows[i - 1].length ? maxSums[i - 1][j]: 0;
                maxSums[i][j] = rows[i][j] + Math.max(leftSum, rightSum);
            }
        }
        int maxSlide = 0;
        for (int i = 0; i < maxSums[n - 1].length; i++) {
            maxSlide = Math.max(maxSlide, maxSums[n - 1][i]);
        }
        return maxSlide;
    }
}
