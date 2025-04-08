package ArquiteturaATV;

public class Celular extends Produto {
    
    public Celular(String nome, double precoBase, double percentualDesconto) {
        super(nome, precoBase, percentualDesconto);

    }
    
    @Override
    public double calcularPreco() {
        return super.calcularPreco();
    }
}
