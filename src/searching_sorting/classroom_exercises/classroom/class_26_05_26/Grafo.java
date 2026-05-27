package searching_sorting.classroom_exercises.classroom.class_26_05_26;

import java.util.*;

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

    public void resetarVisitadoVertices(){
        for (Vertice vertice : vertices){
            vertice.setVisitado(false);
        }
    }

    public void buscaLargura(){
        resetarVisitadoVertices();

        for (Vertice vertice : vertices){
            if (!vertice.isVisitado()){
                largura(vertice);
            }
        }
    }

    private void largura(Vertice vertice) {
        vertice.setVisitado(true);

        Queue<Vertice> filaVertice = new LinkedList<>();
        filaVertice.add(vertice);

        while(!filaVertice.isEmpty()){
            Vertice verticeRetirado = filaVertice.remove();
            for(Aresta arestaAdj : verticeRetirado.getAdjacencias()){
                Vertice destino = arestaAdj.getDestino();
                if (!destino.isVisitado()){
                    destino.setVisitado(true);
                    System.out.print(" " + destino.getNome());
                    filaVertice.add(destino);
                }
            }
        }
    }
}
