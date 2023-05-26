import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел N: ");
        int N = scanner.nextInt();
        int[][] array = generateRandomArray(N);
        System.out.println("Сгенерированный массив:");
        printArray(array);
        int[] sortedArray = snailSort(array);
        System.out.print("Отсортированный массив: ");
        printArray(sortedArray);
    }
    public static int[][] generateRandomArray(int N) {
        int[][] array = new int[N][N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
        return array;
    }
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int[] snailSort(int[][] array) {
        List<Integer> result = new ArrayList<>();

        int rows = array.length;
        int cols = array[0].length;
        int topRow = 0, bottomRow = rows - 1, leftCol = 0, rightCol = cols - 1;
        while (topRow <= bottomRow && leftCol <= rightCol) {
            for (int col = leftCol; col <= rightCol; col++) {
                result.add(array[topRow][col]);
            }
            topRow++;
            for (int row = topRow; row <= bottomRow; row++) {
                result.add(array[row][rightCol]);
            }
            rightCol--;
            if (topRow <= bottomRow) {
                for (int col = rightCol; col >= leftCol; col--) {
                    result.add(array[bottomRow][col]);
                }
                bottomRow--;
            }
            if (leftCol <= rightCol) {
                for (int row = bottomRow; row >= topRow; row--) {
                    result.add(array[row][leftCol]);
                }
                leftCol++;
            }
        }
        int[] sortedArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            sortedArray[i] = result.get(i);
        }
        return sortedArray;
    }
}
