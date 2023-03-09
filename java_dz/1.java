import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("введите кол-во строк в матрице: ");
        int rows = input.nextInt();
        System.out.print("введите кол-во столбцов в матрице: ");
        int columns = input.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        int[][] transMatrix = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
