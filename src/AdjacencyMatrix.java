import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrix {
    int n;
    boolean[][] matrix;

    AdjacencyMatrix(int n) {
        this.n = n;
        matrix = new boolean[n][n];
    }

    public void addEdge(int i, int j) {
        matrix[i][j] = true;
    }

    public void removeEdge(int i, int j) {
        matrix[i][j] = false;
    }

    public boolean hasEdge(int i, int j) {
        return matrix[i][j];
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}