package searching_sorting.classroom_exercises.classroom.class_26_05_26;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class Vertice {
    private String nome;
    private List<Aresta> adjacencias;
    
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
    
    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
    public void adicionarAresta(Aresta a) {
        adjacencias.add(a);
    }
}
