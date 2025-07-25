import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    }
    public void menu() {
        int opc;
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.println("(1) - Pessoa, (2) - blu (3) - blibli (0) - Sair " );
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