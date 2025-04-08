package src;

public class Tablet extends Produto {
    
    public Tablet(String nome, double precoBase, double percentualDesconto) {
        super(nome, precoBase, percentualDesconto);

    }
    
    @Override
    public double calcularPreco() {
        return super.calcularPreco();
    }
}
