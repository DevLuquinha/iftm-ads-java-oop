package classroom.class_26_05_12;

public class Edge {
    private Vertex destiny;
    private int weight;

    public Edge(Vertex destiny, int weight) {
        this.destiny = destiny;
        this.weight = weight;
    }

    public Vertex getDestiny() {
        return destiny;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "destiny=" + destiny +
                ", weight=" + weight +
                '}';
    }
}
