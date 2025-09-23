import java.util.*;

class Graph {
    private Map<String, List<String>> adjList = new HashMap<>();
    private Map<String, Integer> inDegree = new HashMap<>();

    public void addVertex(String vertex) {
        adjList.put(vertex, new ArrayList<>());
        inDegree.put(vertex, 0);
    }

    public void addEdge(String from, String to) {
        adjList.get(from).add(to);
        inDegree.put(to, inDegree.get(to) + 1);
    }

    public List<String> topologicalSort() {
        List<String> sortedList = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        // Add all vertices with in-degree 0 to the queue
        for (String vertex : inDegree.keySet()) {
            if (inDegree.get(vertex) == 0) {
                queue.offer(vertex);
            }
        }

        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            sortedList.add(vertex);

            for (String neighbor : adjList.get(vertex)) {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                if (inDegree.get(neighbor) == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        if (sortedList.size() != adjList.size()) {
            return null; // Cycle exists
        }

        return sortedList;
    }
}
