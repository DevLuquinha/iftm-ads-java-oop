package searching_sorting.studies_to_exam.study03;

public class VerticeAEstrela {
    private Vertice vertice;
    private int custo;

    public VerticeAEstrela(Vertice vertice, int custo){
        this.vertice = vertice;
        this.custo = custo;
    }

    public Vertice getVertice() {
        return vertice;
    }

    public void setVertice(Vertice vertice) {
        this.vertice = vertice;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }
}
