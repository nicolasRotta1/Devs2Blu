import Controller.FamiliaOlfativaController;
import Controller.MarcaController;
import Controller.PerfumeController;
import Controller.FamiliaOlfativaController;
import Controller.MarcaController;
import Controller.PerfumeController;
import Models.FamiliaOlfativa;
import Models.Marca;
import Models.Perfume;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static ArrayList<Perfume> perfumes = new ArrayList<>();
  static ArrayList<Marca> marcas = new ArrayList<>();
  static ArrayList<FamiliaOlfativa> familias = new ArrayList<>();

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    menuPrincipal(scan);
  }

  public static void menuPrincipal(Scanner scan){
    while (true) {
      System.out.println("1. Perfumes");
      System.out.println("2. Marcas");
      System.out.println("3. Familias Olfativas");
      System.out.println("0. Sair");
      System.out.println();
      System.out.print("Digite sua opção:");
      System.out.println();
      int op = scan.nextInt();

      if (op == 0) break;

      switch (op) {
        case 1:
          menuPerfumes(scan);
          break;
        case 2:
          menuMarcas(scan);
          break;
        case 3:
          menuFamilias(scan);
          break;
        default:
          System.out.println("Entrada inválida");
      }
    }
  }

  public static void menuPerfumes(Scanner scan) {
    PerfumeController perfumeController = new PerfumeController();
    MarcaController marcaController = new MarcaController();
    while (true){
      System.out.println("1. Cadastrar Perfume");
      System.out.println("2. Listar Perfumes");
      System.out.println("3. Listar por Marca");
      System.out.println("4. Remover Perfume");
      System.out.println("0. Sair");
      System.out.println();
      System.out.print("Digite sua opção:");
      System.out.println();
      int op = scan.nextInt();

      if (op == 0) break;

      switch (op) {
        case 1:
          perfumeController.cadastrarPerfume(perfumes, marcas, familias);
          break;
        case 2:
          perfumeController.listarPerfumes(perfumes);
          break;
        case 3:
          Marca marcaEscolhida = marcaController.buscarMarcaPorID(marcas);
          ArrayList<Perfume> perfumesOutput = perfumeController.listarPorMarca(perfumes, marcaEscolhida.getNome());
          for (var perfume : perfumesOutput){
            System.out.println(perfume.toString());
          }
          break;
        case 4:
          perfumeController.removerPerfume(perfumes);
          break;
        default:
          System.out.println("Entrada inválida");
      }
    }
  }

  public static void menuMarcas(Scanner scan) {
    MarcaController marcaController = new MarcaController();
    while (true){
      System.out.println("1. Cadastrar Marca");
      System.out.println("2. Listar Marcas");
      System.out.println("3. Remover Marca");
      System.out.println("0. Sair");
      System.out.println();
      System.out.print("Digite sua opção:");
      System.out.println();
      int op = scan.nextInt();

      if (op == 0) break;
      switch (op){
        case 1:
          marcaController.cadastrarMarca(marcas);
          break;
        case 2:
          marcaController.listarMarcas(marcas);
          break;
        case 3:
          marcaController.removerMarcaPorId(marcas);
          break;
        default:
          System.out.println("Entrada inválida");
      }
    }
  }

  public static void menuFamilias(Scanner scan){
    FamiliaOlfativaController familiaOlfativaController = new FamiliaOlfativaController();
    while (true){
      System.out.println("1. Cadastrar Familia");
      System.out.println("2. Listar Familias");
      System.out.println("3. Remover Familia");
      System.out.println("0. Sair");
      System.out.println();
      System.out.print("Digite sua opção:");
      System.out.println();
      int op = scan.nextInt();

      if (op == 0) break;
      switch (op){
        case 1:
          familiaOlfativaController.CadastrarFamilia(familias);
          break;
        case 2:
          familiaOlfativaController.mostrarFamilias(familias);
          break;
        case 3:
          familiaOlfativaController.removerFamiliaOlfativa(familias);
          break;
        default:
          System.out.println("Entrada inválida");

      }
    }
  }
}