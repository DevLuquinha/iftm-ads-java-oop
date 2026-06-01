package searching_sorting.assignments.assignment_09_graphs.a_star;

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
    
    int getDistanciaCidadeAteBucharestLinhaReta(String cidade) {
        int distancia = -1;  // valor padrão para "cidade não encontrada"

        if (cidade.equals("Arad")) distancia = 366;
        else if (cidade.equals("Bucharest")) distancia = 0;
        else if (cidade.equals("Craiova")) distancia = 160;
        else if (cidade.equals("Dobreta")) distancia = 242;
        else if (cidade.equals("Eforie")) distancia = 161;
        else if (cidade.equals("Fagaras")) distancia = 178;
        else if (cidade.equals("Giurgiu")) distancia = 77;
        else if (cidade.equals("Hirsova")) distancia = 151;
        else if (cidade.equals("Iasi")) distancia = 226;
        else if (cidade.equals("Lugoj")) distancia = 244;
        else if (cidade.equals("Mehadia")) distancia = 241;
        else if (cidade.equals("Neamt")) distancia = 234;
        else if (cidade.equals("Oradea")) distancia = 380;
        else if (cidade.equals("Pitesti")) distancia = 98;
        else if (cidade.equals("Rimnicu Vilcea")) distancia = 193;
        else if (cidade.equals("Sibiu")) distancia = 253;
        else if (cidade.equals("Timisoara")) distancia = 329;
        else if (cidade.equals("Urziceni")) distancia = 80;
        else if (cidade.equals("Vaslui")) distancia = 199;
        else if (cidade.equals("Zerind")) distancia = 374;

        return distancia;
    }
}
