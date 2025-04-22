import java.util.LinkedList;

public class AdjacencyList {
    int n;
    LinkedList<Integer> adjListArray[];
    AdjacencyList(int n) {
        this.n = n;
        adjListArray = new LinkedList[n];
        for (int i = 0; i < n; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjListArray[src].add(dest);
    }

    public void printGraph() {
        for (int i = 0; i < n; i++) {
            if (adjListArray[i].size() > 0) {
                System.out.print("Vertex " + i + " is connected to: ");
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    System.out.print(adjListArray[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}