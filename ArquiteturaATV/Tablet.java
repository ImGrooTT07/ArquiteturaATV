package ArquiteturaATV;

public class Tablet extends Produto {
    
    public Tablet(String nome, double precoBase, double percentualDesconto) {
        super(nome, precoBase, percentualDesconto);

    }
    
    public double calcularPreco() {
        return precoBase - (precoBase * percentualDesconto); // calcular desconto para o produto
    }
}
