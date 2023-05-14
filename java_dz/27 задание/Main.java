package Main;

import java.util.Scanner;
public class Main1 {
    public static String[] scannerFunction() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите через пробел строку, сдвиг и направление: ");
        return in.nextLine().split(" ");
    }
    public static void main(String[] args) {
        String[] a = scannerFunction();
        MethodTask line = new MethodTask(a[0], Integer.parseInt(a[1]), a[2]);
        System.out.println(line.encrypt());
    }
}
