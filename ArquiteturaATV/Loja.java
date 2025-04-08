package ArquiteturaATV;

public class Loja {

    public static void main(String[] args) {
        

        Celular celular = new Celular("Celular", 2000, 0.10);
        Notebook notebook = new Notebook("Notebook", 4500, 0.15);
        Tablet tablet = new Tablet("Tablet", 1500, 0.05);


        System.out.println("O preço do celular é R$: " + celular.calcularPreco());
        System.out.println("O preço do notebook é R$: " + notebook.calcularPreco());
        System.out.println("O preço do tablet é R$: " + tablet.calcularPreco());
    }
}