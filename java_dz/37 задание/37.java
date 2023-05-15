import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Кол-во участников?");
        int numPlayers = Integer.parseInt(scanner.nextLine());
        System.out.print("Номер игрока, который ходит первым: ");
        int startPlayer = Integer.parseInt(scanner.nextLine());

        List<Integer> players = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            players.add(i);
        }

        List<Integer> eliminated = new ArrayList<>();
        int current = startPlayer - 1, count = 1;
        while (players.size() > 1) {
            if (count % 3 == 0) {
                eliminated.add(players.remove(current));
                System.out.printf("%s %d is counted out and result %s\n",
                        players.toString(), eliminated.get(eliminated.size() - 1), eliminated.toString());
                current--;
            }
            count++;
            current = (current + 1) % players.size();
        }

        System.out.printf("Выбывшие: %s\n", eliminated.toString());
        System.out.printf("Победитель: %d\n", players.get(0));
    }
}
