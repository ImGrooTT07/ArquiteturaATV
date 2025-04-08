package src;

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

    public double calcularPreco() {
        return precoBase - (precoBase * percentualDesconto); // calcular desconto para o produto
    }
    
    public void exibirPreco() {
        System.out.printf("Preço final do %s: R$%.2f%n", nome, calcularPreco()); // concertando a repetição de varios System.out.println
    }

}