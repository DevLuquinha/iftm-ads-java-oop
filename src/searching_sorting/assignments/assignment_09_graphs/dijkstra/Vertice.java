package searching_sorting.assignments.assignment_09_graphs.dijkstra;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class Vertice {
    private String nome;
    private List<Aresta> adjacencias;
    private Vertice precedente;
    private int custoTotal;
    private boolean visitado;
    
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

    public Vertice getPrecedente() {
        return precedente;
    }

    public void setPrecedente(Vertice precedente) {
        this.precedente = precedente;
    }

    public int getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(int custoTotal) {
        this.custoTotal = custoTotal;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
}
