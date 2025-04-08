package ArquiteturaATV;

public abstract class Produto {
    String nome;
    double precoBase;
    double percentualDesconto;

    public Produto(String nome, double precoBase, double percentualDesconto){
        super();
        this.nome = nome;
        this.precoBase = precoBase;
        this.percentualDesconto = percentualDesconto;
    }

    


    public abstract double calcularPreco();
}