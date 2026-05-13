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

    public List<Vertex> getVertexList(){
        return this.vertexList;
    }
}
