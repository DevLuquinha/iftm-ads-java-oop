package searching_sorting.assignments.assignment_08_graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public void bfs(){
        System.out.print("BUSCA EM LARGURA: ");
        for (Vertice vertice : vertices){
            if (!vertice.isVisitado()){
                buscaAmpl(vertice);
            }
        }
    }

    private void buscaAmpl(Vertice vertice){
        vertice.setVisitado(true);
        System.out.printf(vertice.getNome() + ", ");

        Queue<Vertice> filaVertices = new LinkedList<Vertice>();
        filaVertices.add(vertice);

        while (!filaVertices.isEmpty()){
            Vertice verticeRemovido = filaVertices.remove();
            for (Aresta arestaAdjacente : verticeRemovido.getAdjacencias()){
                Vertice verticeAtual = arestaAdjacente.getDestino();
                if (!verticeAtual.isVisitado()){
                    verticeAtual.setVisitado(true);
                    System.out.printf(verticeAtual.getNome() + ", ");

                    filaVertices.add(verticeAtual);
                }
            }
        }
    }

    public void dfs(){
        System.out.print("BUSCA EM PROFUNDIDADE: ");
        for (Vertice vertice : vertices){
            if (!vertice.isVisitado()){
                prof(vertice);
            }
        }
    }

    private void prof(Vertice vertice){
        System.out.printf(vertice.getNome() + ", ");
        vertice.setVisitado(true);

        for (Aresta arestaAdjacente : vertice.getAdjacencias()){
            Vertice verticeAtual = arestaAdjacente.getDestino();
            if (!verticeAtual.isVisitado()){
                prof(verticeAtual);
            }
        }
    }
}
