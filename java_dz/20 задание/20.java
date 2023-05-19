import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Кол-во строк: ");
        int m = scanner.nextInt();
        System.out.print("Кол-во столбцов: ");
        int n = scanner.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 1;
            }
        }

        for (int i = 1; i <= Math.min(m, n) / 2; i++) {
            int val = i + 1;
            for (int j = i; j < n - i; j++) {
                arr[i][j] = val;
                arr[m - i - 1][j] = val;
            }
            for (int j = i; j < m - i; j++) {
                arr[j][i] = val;
                arr[j][n - i - 1] = val;
            }
        }

        try {
            FileWriter writer = new FileWriter("20.txt");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    writer.write(arr[i][j] + " ");
                }
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка");
            e.printStackTrace();
        }

        scanner.close();
    }
}
