package searching_sorting.studies_to_exam.study02;

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

    public void dijkstra(String nomeOrigem){
        setDefaultValues(nomeOrigem);

        Vertice atual = obterMenorNaoVisitado();

        while (atual != null){
            atual.setVisitado(true);

            for (Aresta arestaAdj : atual.getAdjacencias()){
                Vertice vizinho = arestaAdj.getDestino();
                if (!vizinho.isVisitado()){
                    int novoCusto = atual.getCustoTotal() + arestaAdj.getPeso();
                    if (novoCusto < vizinho.getCustoTotal()){
                        vizinho.setCustoTotal(novoCusto);
                        vizinho.setPrecedente(atual);
                    }
                }
            }

            atual = obterMenorNaoVisitado();
        }
    }

    private Vertice obterMenorNaoVisitado(){
        Vertice menorVertice = null;

        for (Vertice v : vertices){
            if (!v.isVisitado()){
                if (menorVertice == null || v.getCustoTotal() < menorVertice.getCustoTotal()){
                    menorVertice = v;
                }
            }
        }

        return menorVertice;
    }

    private void setDefaultValues(String nomeOrigem){
        for (Vertice v : vertices){
            if (v.getNome().equals(nomeOrigem)){
                v.setCustoTotal(0);
            } else {
                v.setCustoTotal(Integer.MAX_VALUE);
            }

            v.setVisitado(false);
            v.setPrecedente(null);
        }
    }
}
