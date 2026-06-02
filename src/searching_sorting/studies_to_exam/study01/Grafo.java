package searching_sorting.studies_to_exam.study01;

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

    public void caminharLargura(){
        limparVertices();

        System.out.printf("\nCAMINHAMENTO EM LARGURA: ");
        for(Vertice v : vertices){
            if (!v.isVisitado()){
                auxCaminhaLargura(v);
            }
        }
    }

    private void auxCaminhaLargura(Vertice v){
        v.setVisitado(true);
        System.out.printf(v.getNome() + ", ");

        Queue<Vertice> fila = new LinkedList<>();
        fila.add(v);

        while (!fila.isEmpty()){
            Vertice w = fila.remove();

            for (Aresta arestaAdj : w.getAdjacencias()){
                Vertice destino = arestaAdj.getDestino();

                if (!destino.isVisitado()){
                    destino.setVisitado(true);
                    System.out.print(destino.getNome() + ", ");
                    fila.add(destino);
                }
            }
        }
    }

    public void caminhaProdunfidade(){
        limparVertices();
        System.out.printf("\nCAMINHAMENTO EM PROFUNDIDADE: ");

        for (Vertice v : vertices){
            if (!v.isVisitado()){
                auxCaminhaProfundidade(v);
            }
        }
    }

    private void auxCaminhaProfundidade(Vertice v){
        v.setVisitado(true);
        System.out.printf(v.getNome() + ", ");

        for (Aresta arestaAdj : v.getAdjacencias()){
            Vertice w = arestaAdj.getDestino();
            if (!w.isVisitado()){
                auxCaminhaLargura(w);
            }
        }
    }

    private void limparVertices(){
        for (Vertice v : vertices){
            v.setVisitado(false);
        }
    }
}
