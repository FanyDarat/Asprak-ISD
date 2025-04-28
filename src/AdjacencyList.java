import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AdjacencyList {
    int n;
    LinkedList<Character> adjListArray[];

    AdjacencyList(int n) {
        this.n = n;
        adjListArray = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public void addEdge(char src, char dest) {
        adjListArray[src - 'A'].add(dest);
        adjListArray[dest - 'A'].add(src);
    }

    public void printGraph() {
        for (int i = 0; i < n; i++) {
            if (!adjListArray[i].isEmpty()) {
                char vertex = (char) (i + 'A');
                System.out.print("Vertex " + vertex + " is connected to: ");
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(adjListArray[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }

    public void bfs(char start) {
        boolean[] visited = new boolean[n];
        Queue<Character> queue = new LinkedList<>();
        visited[start - 'A'] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            char node = queue.poll();
            System.out.print((node) + " ");
            for (char neighbor : adjListArray[node - 'A']) {
                if (!visited[neighbor - 'A']) {
                    visited[neighbor - 'A'] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public void dfs(char start) {
        boolean[] visited = new boolean[n];
        Stack<Character> stack = new Stack<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            char node = stack.pop();
            if (!visited[node - 'A']) {
                visited[node - 'A'] = true;
                System.out.print((node) + " ");
                LinkedList<Character> neighbors = adjListArray[node - 'A'];
                for (char neighbor : neighbors) {
                    if (!visited[neighbor - 'A']) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}