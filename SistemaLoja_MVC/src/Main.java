import Controllers.ProdutoController;
import Models.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static ArrayList<Produto> produtos = new ArrayList<>();
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);


    menuProduto(scan);

  }

  public static void menuProduto(Scanner scan){
    ProdutoController produtoController = new ProdutoController();
    while(true){
      System.out.println("(1) - Novo Produto");
      System.out.println("(2) - Ver Produto");
      System.out.println("(3) - Remover Produto");
      int op = scan.nextInt();

      switch(op){
        case 1:
          System.out.println("Novo Produto");
          produtoController.cadastrarProduto(produtos);
          break;

        case 2:
          System.out.println("Mostrar produtos");
          produtoController.mostrarProdutos(produtos);
          break;

        default:
          System.out.println("Opção inválida");
      }
      scan.next();
    }
  }
}