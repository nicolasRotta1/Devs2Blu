import Controller.ContaController;
import Models.Conta;
import com.sun.source.tree.ConstantCaseLabelTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ContaController contaController = new ContaController();
    while(true) {
      System.out.println("--- Gerenciador de contas Bancarias ---");
      System.out.println("(1) - Criar Conta");
      System.out.println("(2) - Ver Contas");
      System.out.println("(3) - Alterar Contas");
      System.out.println("(4) - Deletar Contas ");
      System.out.println("(5) - Pesquisar Conta");
      System.out.println("(0) - Sair ");
      int opc = sc.nextInt();

      if (opc == 0)break;;

      switch(opc){
        case 1:
          contaController.Create();
          break;
        case 2:
          contaController.Read();
          break;
        case 3:
          contaController.Update();
          break;
        case 4:
          contaController.Delete();
          break;
        case 5:
      }

    }

  }
}