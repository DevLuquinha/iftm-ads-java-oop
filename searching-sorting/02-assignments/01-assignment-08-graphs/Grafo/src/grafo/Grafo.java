package grafo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class Grafo {
    private List<Vertice> vertices;
    
    public Grafo() {
        this.vertices = new ArrayList();
    }
    
    public void adicionarVertice(String nome) {
        Vertice novoVertice = new Vertice(nome);
        this.vertices.add(novoVertice);
    }
    
    //Busca vértice pelo nome
    public Vertice buscarVertice(String nome) {
        for(int i=0; i < vertices.size(); i++) {
            Vertice v = vertices.get(i);
            
            if(v.getNome().equals(nome)){
                return v;
            }
        }
        return null;
    }
    
    public void adicionarAresta(
            String origem, 
            String destino, 
            int peso) {
        Vertice vOrigem = buscarVertice(origem);
        Vertice vDestino = buscarVertice(destino);
        
        if(vOrigem != null && vDestino != null) {
            Aresta novaAresta = new Aresta(vDestino, peso);
            vOrigem.adicionarAresta(novaAresta);
        } 
    }
    
    public void mostrar() {
        for(int i=0; i < vertices.size(); i++) {
            Vertice v = vertices.get(i);
            System.out.print(v.getNome() + " -> ");
            
            List<Aresta> adj = v.getAdjacencias();
            for(int j=0; j<adj.size(); j++) {
                Aresta a = adj.get(j);
                
                System.out.print(
                        a.getDestino().getNome() +
                                "[" + a.getPeso() + "], "
                );
            }
            System.out.println();
        }
    }
}
