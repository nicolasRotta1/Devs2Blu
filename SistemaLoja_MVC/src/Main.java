import Controllers.CategoriaController;
import Controllers.ProdutoController;
import Models.Categoria;
import Models.Produto;

import javax.script.ScriptContext;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static ArrayList<Produto> produtos =  new ArrayList<>();
    static ArrayList<Categoria> categorias =  new ArrayList<>();
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("(1) - Produtos");
            System.out.println("(2) - Categorias");
            System.out.println("(0) - Sair");
            int op = scan.nextInt();
            if(op == 0 ) break;

            switch (op){
                case 1:
                    menuProduto(scan);
                    break;
                case 2:
                    menuCategoria(scan);
                    break;
                default:
                    System.out.println("Entrada inválida");
            }
        }


    }
    public static void menuProduto(Scanner scan){

        ProdutoController produtoController = new ProdutoController();

        while(true){
            System.out.println("**** PRODUTOS ****\n");
            System.out.println("(1) - Novo Produto");
            System.out.println("(2) - Ver Produtos");
            System.out.println("(3) - Ver Remover");
            System.out.println("(0) - Sair");
            int op =  scan.nextInt();
            if(op == 0)break;

            switch(op){
                case 1:
                    if(categorias.isEmpty()){
                        System.out.println("Cadastre uma categoria primeiro");
                    }else{
                        System.out.println("**** NOVO PRODUTO ****\n");
                        produtoController.cadastrarProduto(produtos, categorias);
                    }

                    break;
                case 2:
                    System.out.println("**** PRODUTOS ****\n");
                    produtoController.mostrarProdutos(produtos);
                    break;
                case 3:
                    System.out.println("*** REMOVER ***zn");
                    produtoController.removarProduto(produtos);
                default:
                    System.out.println("Entrada inválida");
            }
            scan.next();
        }
    }
    public static void menuCategoria(Scanner scan){

        CategoriaController CategoriaController = new CategoriaController();

        while(true){
            System.out.println("**** CATEGORIAS ****\n");
            System.out.println("(1) - Novo Categoria");
            System.out.println("(2) - Ver Categorias");
            System.out.println("(3) - Ver Remover");
            System.out.println("(0) - Sair");
            int op =  scan.nextInt();
            if(op == 0)break;

            switch(op){
                case 1:
                    System.out.println("**** NOVO Categoria ****\n");
                    CategoriaController.cadastrarCategoria(categorias);
                    break;
                case 2:
                    System.out.println("**** Categorias ****\n");
                    CategoriaController.mostrarCategorias(categorias);
                    break;
                case 3:
                    System.out.println("*** REMOVER ***\n");
                    CategoriaController.removerCategoria(categorias);
                default:
                    System.out.println("Entrada inválida");
            }
            scan.next();
        }
    }
}