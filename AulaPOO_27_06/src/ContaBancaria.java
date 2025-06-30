import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ContaBancaria {
    int numero;
    String titular;
    double saldo;
    double qtd;
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public ContaBancaria(){
        this.numero = rand.nextInt(1000, 10000);
    }

    public void menu(Scanner sc){
        System.out.println("----------------- Conta Bancaria -----------------");
        System.out.println("Bem vindo "+this.titular);
        while(true){
            System.out.println("-------------------- MENU -------------------- ");
            System.out.print("(1) - Mostrar Conta - \n(2) - Depositar - \n(3) - Sacar - \n(0) - Sair -\nOpção:   ");
            try {
                String opc = sc.next();
                if(opc.equals(0)) {
                    break;
                }
                switch(opc) {
                    case "1":
                        mostrarConta();
                        break;
                    case "2":
                        Depositar(sc);
                        break;
                    case "3":
                        Sacar(sc);
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;

                }
            }catch(InputMismatchException e) {
                System.out.println("Entrada inválida");
            }catch(Exception e) {
                System.out.println("Erro!");
            }

        }
    }
    public void cadastrar(Scanner sc){
        System.out.print("-- Cadastro de conta bancaria --\nDigite o nome de quem ira utilizar a conta: ");
        try {
            this.titular = sc.next();
        }catch(InputMismatchException e){
            System.out.println("Entrada inválida");
        }catch(Exception e){
            System.out.println("Erro!");
        }
    }
    public void mostrarConta(){
        System.out.println("Número da conta: "+this.numero);
        System.out.println("Titular da conta: "+this.titular);
        System.out.println("Saldo da conta: "+this.saldo);
    }
    public void Sacar(Scanner sc){
        System.out.println("Seu saldo é "+this.saldo);
        System.out.print("Qual a quantia você deseja sacar: ");
        try {
            qtd = sc.nextDouble();
            System.out.print("Você sacou "+this.qtd);
            this.saldo-= qtd;
        }catch(InputMismatchException e) {
            System.out.println("Entrada inválida");
        }catch(Exception e) {
            System.out.println("Erro!");
        }
    }
    public void Depositar(Scanner sc){
        System.out.println("Seu saldo é "+this.saldo);
        System.out.println("Qual a quantia você deseja depositar: ");
        try {
            qtd = sc.nextDouble();
            System.out.println("Você depositou "+this.qtd);
            this.saldo+= qtd;
        }catch(InputMismatchException e) {
            System.out.println("Entrada inválida");
        }catch(Exception e) {
            System.out.println("Erro!");
        }
    }
}
