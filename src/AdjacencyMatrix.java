import java.util.*;

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

    List<Integer> outEdges(int i) {
        List<Integer> edges = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if (matrix[i][j]) edges.add(j);
        }
        return edges;
    }
    List<Integer> inEdges(int i) {
        List<Integer> edges = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if (matrix[j][i]) edges.add(j);
        }
        return edges;
    }

    public void bfs(int start) {
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbor : outEdges(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public void dfs(int start) {
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited[node]) {
                visited[node] = true;
                System.out.print((node + 1) + " ");
                for (int neighbor : outEdges(node)) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}