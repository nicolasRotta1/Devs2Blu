package ListaExercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
  private int opc;
  public void menu() {
    Scanner sc = new Scanner(System.in);
    while (true){
      try {
        System.out.println("(1) - bla, (2) - blu (3) - blibli (0) - Sair " );
        opc = sc.nextInt();
        if (opc == 0) break;

        switch (opc) {

        }
      }catch (InputMismatchException e){
        System.out.println("Entrada inválida");
        sc.nextLine();
      }catch (Exception e){
        System.out.println("ERRO!"+ e.getMessage());
      }
    }
    sc.close();
  }

}
