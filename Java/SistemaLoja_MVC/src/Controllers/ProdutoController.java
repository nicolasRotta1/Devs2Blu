package Controllers;

import Models.Categoria;
import Models.Produto;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoController {
    Scanner scan = new Scanner(System.in);
    CategoriaController categoriaController =  new CategoriaController();

    public void cadastrarProduto(ArrayList<Produto> produtos, ArrayList<Categoria> categorias){


        System.out.println("Nome: ");
        String nome = scan.next();

        System.out.println("Preço: ");
        double preco = scan.nextDouble();

        Categoria categoria = categoriaController.escolherCategoriaPorId(categorias);

        if(categoria == null){
            System.out.println("Categoria inválida!");
        }else{
            produtos.add(new Produto(nome, preco, categoria));
            System.out.println("Produto Cadastrado com sucesso!");

        }


    }

    public void mostrarProdutos(ArrayList<Produto> produtos){
        if(produtos.isEmpty()){
            System.out.println("Não há produtos cadastrados.");
        }else{
            for (var produto : produtos){
                System.out.println(produto.getId()+" - "+produto.getNome()+" R$"+produto.getPreco());
            }
        }

    }
    public void removarProduto(ArrayList<Produto> produtos){
        System.out.println("*** REMOVER ***");
        mostrarProdutos(produtos);
        System.out.print("Id: ");
        int id =  scan.nextInt();

        if(produtos.removeIf( produto -> produto.getId() == id ) ){
            System.out.println("Produto excluido com sucesso");
        }else {
            System.out.println("Produto nao encontrado");
        }

    }


}
