package classroom.class_26_05_12;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Vertex> vertexList;

    public Graph() {
        this.vertexList = new ArrayList<Vertex>();
    }

    public void addVertex(String name) {
        Vertex vertex = new Vertex(name);

        vertexList.add(vertex);
    }

    public Vertex findVertex(String vertexName){
        for (Vertex vertex : vertexList){
            if (vertex != null && vertex.getName().equals(vertexName)){
                return vertex;
            }
        }

        return null;
    }

    public void addEdge(String originName, String destinyName, int weight){
        Vertex origin = findVertex(originName);
        Vertex destiny = findVertex(destinyName);

        // 1. Safe addition
        if (origin != null && destiny != null){
            Edge edge = new Edge(destiny, weight);

            origin.addAdjacent(edge);
        }
    }

    public void show(){
        for (Vertex vertex : vertexList){
            if (vertex != null){
                System.out.print(vertex.getName() + " -> ");

                List<Edge> adjacents = vertex.getAdjacents();
                for (Edge edge : adjacents){
                    if (edge != null){
                        System.out.printf(
                                edge.getDestiny().getName() +
                                "[" + edge.getWeight() + "]");
                    }
                }

                System.out.println();
            }
        }
    }

    public List<Vertex> getVertexList(){
        return this.vertexList;
    }
}
