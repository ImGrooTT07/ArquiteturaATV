package ArquiteturaATV;

public class Notebook extends Produto {
    
    public Notebook(String nome, double precoBase, double percentualDesconto) {
        super(nome, precoBase, percentualDesconto);

    }
    @Override
    public double calcularPreco() {
        return precoBase - (precoBase * percentualDesconto); // 10% de desconto
    }
}
