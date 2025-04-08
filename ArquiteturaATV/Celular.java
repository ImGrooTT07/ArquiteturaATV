package ArquiteturaATV;

public class Celular extends Produto {
    
    public Celular(String nome, double precoBase) {
        super(nome, precoBase);

    }
    @Override
    public double calcularPreco() {
        return super.precoBase * 0.90; // 10% de desconto
    }
}
