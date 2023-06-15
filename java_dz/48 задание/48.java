import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> u = new HashSet<Integer>();
        u.add(1);

        int limit = 100;
        for (int i = 1; i <= limit; i++) {
            int ui = 2 * (int)u.toArray()[i - 1] + 1;
            if(ui <= limit){
                u.add(ui);
            }else{
                break;
            }
        }
        System.out.println(u);
    }
}
