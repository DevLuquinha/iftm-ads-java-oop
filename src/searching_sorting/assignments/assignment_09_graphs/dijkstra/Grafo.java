package searching_sorting.assignments.assignment_09_graphs.dijkstra;

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

    public void dijkstra(String nomeOrigem){
        // 1. Inicializar os nós
        setDefaultValues(nomeOrigem);

        // 2. Loop principal
        Vertice menorVertice = buscarVertice(nomeOrigem);

        while(menorVertice != null){
            menorVertice.setVisitado(true);

            // Relaxamento das arestas
            for (Aresta aresta : menorVertice.getAdjacencias()){
                Vertice destino = aresta.getDestino();
                if (!destino.isVisitado()){
                    int novoCusto = menorVertice.getCustoTotal() + aresta.getPeso();
                    if (novoCusto < destino.getCustoTotal()){
                        destino.setCustoTotal(novoCusto);
                        destino.setPrecedente(menorVertice);
                    }
                }
            }

            menorVertice = obterMenorNaoVisitado();
        }
    }

    private Vertice obterMenorNaoVisitado(){
        Vertice menorVertice = null;
        for(Vertice v : vertices){
            if (!v.isVisitado()){
                // Se for nulo OU se o custo do vértice atual for menor que o custo do menor salvo
                if (menorVertice == null || v.getCustoTotal() < menorVertice.getCustoTotal()){
                    menorVertice = v;
                }
            }
        }

        return menorVertice;
    }

    private void setDefaultValues(String nomeOrigem){
        for (Vertice vertice : vertices){
            // Just set 0 for root
            if (vertice.getNome().equals(nomeOrigem)){
                vertice.setCustoTotal(0);
            } else {
                // Set infinity for all nodes
                vertice.setCustoTotal(Integer.MAX_VALUE);
            }

            // Set false for all nodes
            vertice.setVisitado(false);
        }
    }
}
