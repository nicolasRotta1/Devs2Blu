package Controller;

import Models.FamiliaOlfativa;
import Models.Marca;
import Models.Perfume;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfumeController {
  MarcaController marcaController = new MarcaController();
  FamiliaOlfativaController familiaOlfativaController = new FamiliaOlfativaController();

  public void cadastrarPerfume(ArrayList<Perfume> perfumes, ArrayList<Marca> marcas, ArrayList<FamiliaOlfativa> familias) {
    Scanner scan = new Scanner(System.in);

    System.out.println("========Cadastro de Novo Perfume========");
    System.out.println("Digite o Nome do Perfume: ");

    String nome = scan.next();

    marcaController.listarMarcas(marcas);
    Marca marcaEscolhida = marcaController.buscarMarcaPorID(marcas);

    if (marcaEscolhida == null) System.out.println("Marca inválida");
    System.out.println("Digite o volume do perfume (em ml): ");
    double volume = scan.nextDouble();

    familiaOlfativaController.mostrarFamilias(familias);
    FamiliaOlfativa familiaEscolhida = familiaOlfativaController.escolherFamiliaPorId(familias);

    FamiliaOlfativa[] familia = familias.toArray(new FamiliaOlfativa[0]);
    familia[0] = familiaEscolhida;

    if (familiaEscolhida == null) System.out.println("Familia inválida");
    String genero = selecionarGenero();

    if (genero == null) System.out.println("Genero inválido");
    System.out.println("Digite o preço: ");
    double preco = scan.nextDouble();
    scan.nextLine();

    System.out.println("Digite uma descrição: ");
    String desc = scan.nextLine();

    try{
      Perfume perfume = new Perfume(nome, marcaEscolhida, volume, familia, genero, preco, desc);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void listarPerfumes(ArrayList<Perfume> perfumes) {
    for (var perfume : perfumes) {
      System.out.println(perfume.toString());
    }
  }

  public ArrayList<Perfume> listarPorMarca(ArrayList<Perfume> perfumes, String nomeMarca) {
    ArrayList<Perfume> listaOutput = new ArrayList<>();
    for (var perfume : perfumes) {
      if (perfume.getMarca().getNome().equals(nomeMarca)) {
        listaOutput.add(perfume);
      }
    }
    return listaOutput;
  }

  public void removerPerfume(ArrayList<Perfume> perfumes) {
    Scanner scan = new Scanner(System.in);
    listarPerfumes(perfumes);
    System.out.println("******REMOVER******");
    System.out.println("Digite o ID do perfume que deseja remover: ");
    int id = scan.nextInt();
    if (perfumes.removeIf(perfume -> perfume.getId() == id)) System.out.println("Perfume removido!");
    else System.out.println("Não foi possível remover perfume com ID: " + id);
  }

  public String selecionarGenero(){
    Scanner scan = new Scanner(System.in);
    while (true) {
      System.out.println("1. Masculino");
      System.out.println("2. Feminino");
      System.out.println("3. Unissex");
      System.out.println("4. Infantil");

      System.out.println("Digite o número do Genêro escolhido: ");
      int op = scan.nextInt();
      switch (op){
        case 1:
          return "Masculino";
        case 2:
          return "Feminino";
        case 3:
          return "Unissex";
        case 4:
          return "Infantil";
        default:
          System.out.println("Entrada inválida.");
      }
    }
  }
}

