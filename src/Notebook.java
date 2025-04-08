package src;

public class Notebook extends Produto {
    
    public Notebook(String nome, double precoBase, double percentualDesconto) {
        super(nome, precoBase, percentualDesconto);

    }
    
    @Override
    public double calcularPreco() {
        return super.calcularPreco();
    }
}
