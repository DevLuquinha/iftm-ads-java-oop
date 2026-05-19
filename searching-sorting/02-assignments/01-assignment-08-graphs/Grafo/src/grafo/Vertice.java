package grafo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class Vertice {
    private String nome;
    private List<Aresta> adjacencias;
    
    public Vertice(String nome){
        this.nome = nome;
        this.adjacencias = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public List<Aresta> getAdjacencias() {
        return adjacencias;
    }
    
    public void adicionarAresta(Aresta a) {
        adjacencias.add(a);
    }
}
