package Controller;

import Models.FamiliaOlfativa;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FamiliaOlfativaController {
  Scanner scan = new Scanner(System.in);
  public void CadastrarFamilia(ArrayList<FamiliaOlfativa> familiaOlfativas){
    System.out.println("Digite o nome da familia olfativa");
    String nome = scan.next();
    System.out.println("Digite a descrição da familia olfativa");
    String descricao = scan.next();

    familiaOlfativas.add(new FamiliaOlfativa(nome, descricao));
  }

  public void mostrarFamilias(ArrayList<FamiliaOlfativa> familiaOlfativas) {
    for (FamiliaOlfativa familia : familiaOlfativas) {
      System.out.println(familia.getId() + " - " + familia.getNome());
    }
  }

  public void removerFamiliaOlfativa(ArrayList<FamiliaOlfativa> familiaOlfativas) {
    System.out.println("*** REMOVER ***");
    this.mostrarFamilias(familiaOlfativas);
    System.out.print("Id: ");
    int id = this.scan.nextInt();
    if (familiaOlfativas.removeIf((Categoria) -> Categoria.getId() == id)) {
      System.out.println("Familia olfativa excluida com sucesso");
    } else {
      System.out.println("Familia olfativa nao encontrada");
    }

  }

  public FamiliaOlfativa escolherFamiliaPorId(ArrayList<FamiliaOlfativa> familiaOlfativas) {
    System.out.println("Escolha a Familia olfativa: ");
    this.mostrarFamilias(familiaOlfativas);
    System.out.print("Id: ");
    int idFamiliaOlfativa = this.scan.nextInt();

    for(var familiaOlfativa : familiaOlfativas) {
      if (familiaOlfativa.getId() == idFamiliaOlfativa) {
        return familiaOlfativa;
      }
    }

    return null;
  }

}
