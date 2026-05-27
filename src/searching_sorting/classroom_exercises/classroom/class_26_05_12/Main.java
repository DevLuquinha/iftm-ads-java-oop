package searching_sorting.classroom_exercises.classroom.class_26_05_12;

public class Main {
    static void main(String[] args) {
        Graph graph = new Graph();

        // 1. Create vertex
        graph.addVertex("1");
        graph.addVertex("2");
        graph.addVertex("3");
        graph.addVertex("4");
        graph.addVertex("5");
        graph.addVertex("6");
        graph.addVertex("7");
        graph.addVertex("8");
        graph.addVertex("9");
        graph.addVertex("10");

        // 2. Create edges (1 as origin)
        graph.addEdge("1", "2", 10);
        graph.addEdge("1", "4", 20);
        graph.addEdge("1", "5", 20);
        graph.addEdge("1", "6", 5);
        graph.addEdge("1", "7", 15);

        // 3. Create edges (2 as origin)
        graph.addEdge("2", "3", 5);
        graph.addEdge("2", "4", 10);

        // 4. Create edges (3 as origin)
        graph.addEdge("3", "2", 15);
        graph.addEdge("3", "4", 5);

        // 5. Create edges (4 as origin)
        graph.addEdge("4", "5", 10);

        // 4. Create edges (5 as origin)
        graph.addEdge("5", "6", 5);

        // 5. Create edges (7 as origin)
        graph.addEdge("7", "6", 10);

        // 6. Create edges (8 as origin)
        graph.addEdge("8", "1", 5);
        graph.addEdge("8", "2", 20);
        graph.addEdge("8", "7", 5);

        // 7. Create edges (9 as origin)
        graph.addEdge("9", "2", 15);
        graph.addEdge("9", "8", 15);
        graph.addEdge("9", "10", 10);

        // 8. Create edges (10 as origin)
        graph.addEdge("10", "2", 5);
        graph.addEdge("10", "3", 15);

        // 9. Show the grap
        graph.show();
    }
}
