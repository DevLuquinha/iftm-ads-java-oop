package searching_sorting.studies_to_exam.study03;

import java.util.ArrayList;
import java.util.LinkedList;
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

    public boolean buscaAEstrela(Vertice verticeAtual, String destino){
        if (verticeAtual.getNome().equals(destino)){
            System.out.printf("Caminho traçado: " + verticeAtual.getNome() + ", ");
            return true;
        }

        List<VerticeAEstrela> listaOrdenada = new LinkedList<>();

        for (Aresta arestaAdj : verticeAtual.getAdjacencias()){
            Vertice vizinho = arestaAdj.getDestino();
            String nomeDestino = arestaAdj.getDestino().getNome();
            int custo = arestaAdj.getPeso() + getDistanciaCidadeAteBucharestLinhaReta(nomeDestino);

            insereOrdenado(listaOrdenada, vizinho, custo);
        }

        for (VerticeAEstrela item : listaOrdenada){
            Vertice proximoVertice = item.getVertice();
            if (buscaAEstrela(proximoVertice, destino)){
                System.out.printf(verticeAtual.getNome() + ", ");
                return true;
            }
        }

        return false;
    }

    private void insereOrdenado(List<VerticeAEstrela> lista, Vertice vertice, int custo){
        VerticeAEstrela novoItem = new VerticeAEstrela(vertice, custo);

        for (int i = 0; i < lista.size(); i++){
            VerticeAEstrela verticeAtual = lista.get(i);
            if (custo < verticeAtual.getCusto()){
                lista.add(i, novoItem);
                return;
            }
        }

        lista.add(novoItem);
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
