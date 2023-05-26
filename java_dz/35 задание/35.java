import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите зашифрованное сообщение: ");
        String encryptedMessage = scanner.nextLine();

        System.out.print("Введите количество позиций для сдвига: ");
        int shift = scanner.nextInt();
        scanner.close();

        String decryptedMessage = decryptMessage(encryptedMessage, shift);
        System.out.println("Расшифрованное сообщение: " + decryptedMessage);
    }

    public static String decryptMessage(String message, int shift) {
        String decrypted = "";
        int length = message.length();

        for (int i = 0; i < length; i++) {
            char ch = message.charAt(i);

            if (Character.isLetter(ch)) {
                char shiftedChar = (char) (ch - shift);

                if (Character.isLowerCase(ch)) {
                    if (shiftedChar < 'a') {
                        shiftedChar = (char) (shiftedChar + 26);
                    }
                } else {
                    if (shiftedChar < 'A') {
                        shiftedChar = (char) (shiftedChar + 26);
                    }
                }

                decrypted += shiftedChar;
            } else {
                decrypted += ch;
            }
        }

        return decrypted;
    }
}
