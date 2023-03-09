import java.util.Scanner;
public class zadanie_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите работников предприятия: ");
        String userInput = input.nextLine();
        String[] inputArray = userInput.replaceAll("[^01]+", "").split("");
        boolean[] emp = new boolean[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            emp[i] = inputArray[i].equals("1");
        }
        int empCount = 0;
        for (boolean isEmployee : emp) {
            if (isEmployee) {
                empCount++;
            }
        }
        System.out.println("кол-во работников предприятия: " + empCount);
    }
}
