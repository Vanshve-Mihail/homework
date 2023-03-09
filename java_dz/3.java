public class dddd {
    public static void main(String[] args) {
        double[] A = {7, 1};
        double[] B = {10, 8};
        double[] C = {1, 10};

        double[] D = {(B[0] + C[0]) / 2, (B[1] + C[1]) / 2};
        double[] E = {(A[0] + C[0]) / 2, (A[1] + C[1]) / 2};
        double[] F = {(A[0] + B[0]) / 2, (A[1] + B[1]) / 2};

        double[] bary = {(D[0] + E[0] + F[0]) / 3, (D[1] + E[1] + F[1]) / 3};

        System.out.printf("{%.4f, %.4f}", bary[0], bary[1]);
    }
}
