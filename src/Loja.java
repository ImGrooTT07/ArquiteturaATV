package src;

public class Loja {

    public static void main(String[] args) {
   
        Produto celular = new Celular("Celular", 2000, 0.10);
        Produto notebook = new Notebook("Notebook", 4500, 0.15);
        Produto tablet = new Tablet("Tablet", 1500, 0.05);


        celular.exibirPreco();
        notebook.exibirPreco();
        tablet.exibirPreco();
    }
}