import java.util.List;

public class Main {
    public static void main(String[] args) {
        Graph taskGraph = new Graph();

        // Add all tasks as vertices
        taskGraph.addVertex("Hologram");
        taskGraph.addVertex("Pengepasan kostum");
        taskGraph.addVertex("Pencahayaan");
        taskGraph.addVertex("Kostum");
        taskGraph.addVertex("Pembuatan panggung");
        taskGraph.addVertex("Properti panggung");
        taskGraph.addVertex("Persiapan panggung");
        taskGraph.addVertex("Kontak tim lain");

        // Establish dependencies between tasks
        taskGraph.addEdge("Kostum", "Pengepasan kostum");
        taskGraph.addEdge("Pencahayaan", "Hologram");
        taskGraph.addEdge("Pembuatan panggung", "Properti panggung");
        taskGraph.addEdge("Pembuatan panggung", "Persiapan panggung");
        taskGraph.addEdge("Properti panggung", "Hologram");
        taskGraph.addEdge("Persiapan panggung", "Kontak tim lain");

        List<String> taskOrder = taskGraph.topologicalSort();

        if (taskOrder != null) {
            System.out.println("Urutan Pelaksanaan Tugas:");
            for (int i = 0; i < taskOrder.size(); i++) {
                System.out.println((i+1) + ". " + taskOrder.get(i));
            }
        } else {
            System.out.println("Ada circular dependency dalam tugas-tugas.");
        }
    }
}
