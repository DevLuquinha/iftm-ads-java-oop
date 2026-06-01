package searching_sorting.assignments.assignment_09_graphs.a_star;

/**
 *
 * @author Guilherme
 */
public class Main {

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        
        String[] cidades = {"Arad","Bucharest","Craiova","Dobreta","Fagaras",
        "Lugoj","Mehadia","Oradea","Pitesti","Rimnicu Vilcea","Sibiu","Timisoara",
        "Zerind"};
        
        for (String cidade : cidades) {
            grafo.adicionarVertice(cidade);
        }
        
        criarArestasGrafoCidades(grafo);

        grafo.buscaAEstrela(grafo.buscarVertice("Arad"), "Bucharest");
    }
    
    public static void criarArestasGrafoCidades(Grafo grafo) {
        // Arad
        grafo.adicionarAresta("Arad", "Zerind", 75);
        grafo.adicionarAresta("Arad", "Sibiu", 140);
        grafo.adicionarAresta("Arad", "Timisoara", 118);

        // Zerind
        grafo.adicionarAresta("Zerind", "Arad", 75);
        grafo.adicionarAresta("Zerind", "Oradea", 71);

        // Sibiu
        grafo.adicionarAresta("Sibiu", "Arad", 140);
        grafo.adicionarAresta("Sibiu", "Oradea", 151);
        grafo.adicionarAresta("Sibiu", "Fagaras", 99);
        grafo.adicionarAresta("Sibiu", "Rimnicu Vilcea", 80);

        // Timisoara
        grafo.adicionarAresta("Timisoara", "Arad", 118);
        grafo.adicionarAresta("Timisoara", "Lugoj", 111);

        // Oradea
        grafo.adicionarAresta("Oradea", "Zerind", 71);
        grafo.adicionarAresta("Oradea", "Sibiu", 151);

        // Fagaras
        grafo.adicionarAresta("Fagaras", "Sibiu", 99);
        grafo.adicionarAresta("Fagaras", "Bucharest", 211);

        // Rimnicu Vilcea
        grafo.adicionarAresta("Rimnicu Vilcea", "Sibiu", 80);
        grafo.adicionarAresta("Rimnicu Vilcea", "Pitesti", 97);
        grafo.adicionarAresta("Rimnicu Vilcea", "Craiova", 146);

        // Pitesti
        grafo.adicionarAresta("Pitesti", "Rimnicu Vilcea", 97);
        grafo.adicionarAresta("Pitesti", "Bucharest", 101);
        grafo.adicionarAresta("Pitesti", "Craiova", 138);

        // Craiova
        grafo.adicionarAresta("Craiova", "Rimnicu Vilcea", 146);
        grafo.adicionarAresta("Craiova", "Pitesti", 138);
        grafo.adicionarAresta("Craiova", "Dobreta", 120);

        // Dobreta
        grafo.adicionarAresta("Dobreta", "Craiova", 120);
        grafo.adicionarAresta("Dobreta", "Mehadia", 75);

        // Mehadia
        grafo.adicionarAresta("Mehadia", "Dobreta", 75);
        grafo.adicionarAresta("Mehadia", "Lugoj", 70);

        // Lugoj
        grafo.adicionarAresta("Lugoj", "Mehadia", 70);
        grafo.adicionarAresta("Lugoj", "Timisoara", 111);

        // Bucharest
        grafo.adicionarAresta("Bucharest", "Fagaras", 211);
        grafo.adicionarAresta("Bucharest", "Pitesti", 101);
    }
}
