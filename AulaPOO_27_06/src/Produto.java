import java.util.Random;

public class Produto {
    int id;
    String categoria;
    String nome;
    String cor;
    double preco;
    int pedidos;
    double peso;
    double altura;
    double comprimento;
    String formato;
    int estoque;
    String fornecedor;

    public Produto(){
        this.id = new Random().nextInt(1000, 10000);
    }
    public void mostrarProduto(){
        System.out.println("Id: "+this.id);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Nome: "+this.nome);
        System.out.println("preco: "+this.preco);
        System.out.println("Peso: "+this.peso);
        System.out.println("Altura: "+this.altura);
        System.out.println("Comprimento: "+this.comprimento);
        System.out.println("Formato: "+this.formato);
        System.out.println("Cor: "+this.cor);
        System.out.println("Estoque: "+this.estoque);
        System.out.println("Fornecedor: "+this.fornecedor);
        System.out.println("Pedidos: "+this.pedidos);
    }
    public void diminuirEstoque(int qtd){
        if (this.estoque>= qtd){
        this.estoque -=   qtd;
            System.out.println("Estoque: "+ this.estoque);
    }else {
            System.out.println("Estoque insuficiente");
        }
    }

}
