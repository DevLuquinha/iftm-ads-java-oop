package grafo;

/**
 *
 * @author Guilherme
 */
public class Main {

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        
        grafo.adicionarVertice("1");
        grafo.adicionarVertice("2");
        grafo.adicionarVertice("3");
        grafo.adicionarVertice("4");
        grafo.adicionarVertice("5");
        grafo.adicionarVertice("6");
        grafo.adicionarVertice("7");
        grafo.adicionarVertice("8");
        grafo.adicionarVertice("9");
        grafo.adicionarVertice("10");
        
        grafo.adicionarAresta("1","2",10);
        grafo.adicionarAresta("1","4",20);
        grafo.adicionarAresta("1","5",20);
        grafo.adicionarAresta("1","6",5);
        grafo.adicionarAresta("1","7",15);
        
        grafo.adicionarAresta("2","3",5);
        grafo.adicionarAresta("2","4",10);
        
        grafo.adicionarAresta("3","2",15);
        grafo.adicionarAresta("3","4",5);
        
        grafo.adicionarAresta("4","5",10);
        
        grafo.adicionarAresta("5","6",5);
        
        grafo.adicionarAresta("7","6",10);
        
        grafo.adicionarAresta("8","1",5);
        grafo.adicionarAresta("8","2",20);
        grafo.adicionarAresta("8","7",5);
        
        grafo.adicionarAresta("9","2",15);
        grafo.adicionarAresta("9","8",20);        
        grafo.adicionarAresta("9","10",10);
        
        grafo.adicionarAresta("10","2",5);
        grafo.adicionarAresta("10","3",15);
     
//        grafo.mostrar();
        grafo.bfs();
    }
}
