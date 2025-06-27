//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Bomba Atômica ";
        produto1.categoria = "Arma";
        produto1.preco = 5000000;
        produto1.peso = 3000;
        produto1.altura = 5;
        produto1.comprimento = 2;
        produto1.formato = "oval";
        produto1.cor = "verde";
        produto1.estoque = 100;
        produto1.fornecedor = "Bob";
        produto1.pedidos = 2;
        produto1.mostrarProduto();
        produto1.diminuirEstoque(100);

    }
}