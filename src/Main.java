public class Main {
    public static void main(String[] args) {
        AdjacencyMatrix graphMatrix = new AdjacencyMatrix(5);
        AdjacencyList graphList = new AdjacencyList(6);

        graphMatrix.addEdge(0, 1);
        graphMatrix.addEdge(1, 2);
        graphMatrix.addEdge(2, 3);
        graphMatrix.addEdge(3, 1);
        graphMatrix.addEdge(3, 2);
        graphMatrix.addEdge(3, 4);
        graphMatrix.addEdge(4, 0);

        graphList.addEdge(1, 2);
        graphList.addEdge(2, 3);
        graphList.addEdge(3, 4);
        graphList.addEdge(4, 2);
        graphList.addEdge(4, 3);
        graphList.addEdge(4, 5);
        graphList.addEdge(5, 1);

        graphMatrix.printMatrix();
        System.out.println();
        graphList.printGraph();
    }
}