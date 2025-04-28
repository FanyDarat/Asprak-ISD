public class Main {
    public static void main(String[] args) {

//        AdjacencyMatrix graphMatrix = new AdjacencyMatrix(8);
        AdjacencyList graph = new AdjacencyList(8);

//        graphMatrix.addEdge('A', 'B');
//        graphMatrix.addEdge('B', 'D');
//        graphMatrix.addEdge('D', 'E');
//        graphMatrix.addEdge('E', 'F');
//        graphMatrix.addEdge('F', 'G');
//        graphMatrix.addEdge('G', 'C');
//        graphMatrix.addEdge('C', 'A');
//        graphMatrix.addEdge('A', 'H');

        graph.addEdge('H', 'A');
        graph.addEdge('A', 'B');
        graph.addEdge('A', 'C');
        graph.addEdge('B', 'D');
        graph.addEdge('D', 'E');
        graph.addEdge('E', 'F');
        graph.addEdge('F', 'G');
        graph.addEdge('G', 'C');

        System.out.println("DFS");
        graph.dfs('A');
        System.out.println();
        System.out.println("BFS");
        graph.bfs('A');
    }
}