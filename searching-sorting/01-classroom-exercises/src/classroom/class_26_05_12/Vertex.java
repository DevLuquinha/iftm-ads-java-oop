package classroom.class_26_05_12;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private List<Edge> adjacents;

    public Vertex(String name) {
        this.name = name;
        this.adjacents = new ArrayList<Edge>();
    }

    public String getName() {
        return name;
    }

    public List<Edge> getAdjacents() {
        return adjacents;
    }

    public void addAdjacent(Edge edge) {
        adjacents.add(edge);
    }
}
