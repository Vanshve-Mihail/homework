public class Main {
    public static void main(String[] args) {
        int n = 100;
        int result = fusc(n);
        System.out.printf("F(%s) = %s", n,result);
    }
    public static int fusc(int n) {
        return F(1, 0, n);
    }
    private static int F(int a, int b, int n) {
        if (n == 0) {
            return b;
        } else if (n == 1) {
            return a + b;
        } else if (n % 2 == 0) {
            return F(a, b, n / 2);
        } else {
            return F(a, b, n / 2) + a + F(a, b, n / 2 + 1);
        }
    }
}
