package ArquiteturaATV;

public abstract class Produto {
    String nome;
    double precoBase;

    public Produto(String nome, double precoBase){
        super();
        this.nome = nome;
        this.precoBase = precoBase;
    }


    public abstract double calcularPreco();
}