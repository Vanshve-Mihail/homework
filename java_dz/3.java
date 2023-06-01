import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите координаты вершин треугольника: ");
        String verticesInput = input.nextLine();
        double[][] vertices = new double[3][2];

        verticesInput = verticesInput.replace("[", "").replace("]", "").replace(",", "");
        String[] vertexCoords = verticesInput.split(" ");
        for (int i = 0; i < 3; i++) {
            vertices[i][0] = Double.parseDouble(vertexCoords[i*2]);
            vertices[i][1] = Double.parseDouble(vertexCoords[i*2+1]);
        }

        double[][] midpoints = new double[3][2];
        for (int i = 0; i < 3; i++) {
            int j = (i+1) % 3;
            midpoints[i][0] = (vertices[i][0] + vertices[j][0]) / 2;
            midpoints[i][1] = (vertices[i][1] + vertices[j][1]) / 2;
        }

        double[] barycenter = new double[2];
        for (int i = 0; i < 3; i++) {
            barycenter[0] += midpoints[i][0];
            barycenter[1] += midpoints[i][1];
        }
        barycenter[0] /= 3;
        barycenter[1] /= 3;

        System.out.printf("Барицентр: (%.4f, %.4f)", barycenter[0], barycenter[1]);

        input.close();
    }
}
