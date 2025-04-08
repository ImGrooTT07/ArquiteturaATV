package ArquiteturaATV;

public class Celular extends Produto {
    
    public Celular(String nome, double precoBase, double percentualDesconto) {
        super(nome, precoBase, percentualDesconto);

    }
    @Override
    public double calcularPreco() {
        return precoBase - (precoBase * percentualDesconto); // 10% de desconto
    }
}
