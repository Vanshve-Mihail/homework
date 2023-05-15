import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1 {

    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }

    public static List<Integer> sortByDigitSum(List<Integer> weights) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return sumOfDigits(i1) - sumOfDigits(i2);
            }
        };
        Collections.sort(weights, comparator);
        return weights;
    }

    public static void main(String[] args) {
        List<Integer> weights = new ArrayList<Integer>();
        weights.add(56);
        weights.add(65);
        weights.add(74);
        weights.add(100);
        weights.add(99);
        weights.add(68);
        weights.add(86);
        weights.add(180);
        weights.add(90);
        List<Integer> sortedWeights = sortByDigitSum(weights);
        System.out.println(sortedWeights);
    }
}
