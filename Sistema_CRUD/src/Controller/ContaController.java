package Controller;

import Models.Conta;
import Models.ContaBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public  class ContaController{
  static ArrayList<Conta> contas = new ArrayList<>();
  Scanner sc = new Scanner(System.in);

  public void Create() {
    System.out.println("--- Criando Nova Conta ---");
    System.out.println("Digite o nome de quem ira utiliar a conta: ");
    String nome = sc.next();
    contas.add(new ContaBancaria(nome));
  }


  public void Read() {
    for (var conta : contas){
      System.out.println("Id: "+conta.getId());
      System.out.println("Nome: "+conta.getNome());
      System.out.println("Saldo: "+conta.getSaldo());
    }
  }


  public void Update() {
    Read();
    System.out.println("Qual conta deseja Alterar: ");
    int id = sc.nextInt();
    System.out.println("Novo nome: ");
    String nome = sc.next();

    contas.set(id, new ContaBancaria(nome) );
  }


  public void Delete() {
    Read();
    System.out.println("Digite o numero da conta a ser removida: ");
    int id = sc.nextInt();
    contas.remove(id);

  }


  public void FindById(int id) {

  }
}