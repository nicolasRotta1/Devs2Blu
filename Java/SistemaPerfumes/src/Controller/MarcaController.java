package Controller;

import Models.Marca;

import java.util.ArrayList;
import java.util.Scanner;

public class MarcaController {

  public void cadastrarMarca(ArrayList<Marca> marcas) {
    Scanner scan = new Scanner(System.in);
    System.out.println("******Cadastro de Nova Marca******");
    System.out.println("Digite o nome: ");
    String nome = scan.next();
    System.out.println("Digite o País de Origem: ");
    String pais = scan.next();
    System.out.println("Digite o URL do site: ");
    String urlSite = scan.next();

    marcas.add(new Marca(nome, pais, urlSite));
    System.out.println("Marca adicionada com sucesso!");
  }

  public void listarMarcas(ArrayList<Marca> marcas){
    for (var marca : marcas) {
      System.out.println(marca.getId() + " - " + marca.getNome());
    }
  }

  public Marca buscarMarcaPorID(ArrayList<Marca> marcas) {
    Scanner scan = new Scanner(System.in);
    listarMarcas(marcas);
    System.out.println("Digite o ID da marca escolhida:");
    int id = scan.nextInt();
    for (var marca : marcas){
      if (marca.getId() == id){
        return marca;
      }
    }
    return null;
  }

  public void removerMarcaPorId(ArrayList<Marca> marcas){
    Scanner scan = new Scanner(System.in);
    listarMarcas(marcas);
    System.out.println("*******REMOVER*******");
    System.out.println("Digite o ID da marca que deseja remover: ");
    int id = scan.nextInt();
    if (marcas.removeIf(marca -> marca.getId() == id)) System.out.println("Marca removida com sucesso!");
    else {
      System.out.println("Não foi possivel remover a marca com ID: " + id);
    }
  }
}
