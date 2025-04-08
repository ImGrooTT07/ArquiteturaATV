package ArquiteturaATV;

public class Loja {

    public static void main(String[] args) {
        

        Celular celular = new Celular("Celular", 2000);

        System.out.println("O preço do celular é R$: " + celular.calcularPreco());
    }
}