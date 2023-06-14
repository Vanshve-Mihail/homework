import java.io.*;
class HistoryManager {
    private static final String FILE_PATH = "50z.txt";
    public void saveEquation(String equation, double result) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true));
            writer.write(equation + " = " + result);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении уравнения: " + e.getMessage());
        }
    }
    public void displayHistory() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
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
