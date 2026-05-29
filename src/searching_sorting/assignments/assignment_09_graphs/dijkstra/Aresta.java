package searching_sorting.assignments.assignment_09_graphs.dijkstra;

/**
 *
 * @author Guilherme
 */
public class Aresta {
    private Vertice destino;
    private int peso;
    
    public Aresta(Vertice destino, int peso){
        this.destino = destino;
        this.peso = peso;
    }

    public Vertice getDestino() {
        return destino;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Aresta{" + "destino=" + destino.getNome() + ", peso=" + peso + '}';
    }
    
    
}
