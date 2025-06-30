package packagePOO;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ContaBancaria {
    int numero;
    String titular;
    double saldo;
    double qtd;
    Scanner sc = new Scanner(System.in);


    public ContaBancaria(){
        this.numero = new Random().nextInt(1000, 10000);
    }

    public void menu(Scanner sc){
        System.out.println("----------------- Conta Bancaria -----------------");
        System.out.println("Bem vindo "+this.titular);
        while(true){
            System.out.println("-------------------- MENU -------------------- ");
            System.out.println("(1) - Mostrar Conta - \n(2) - Depositar - \n(3) - Sacar - \n(0) - Sair -  ");
            try {
            int opc = sc.nextInt();
            if(opc == 0) {
            	break;
            }
            switch(opc) {
                case 1:
                	mostrarConta();
                break;
                	
                case 2:
                	Depositar();
                	break;
                case 3:
                	Sacar();
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
        System.out.println("-- Cadastro de conta bancaria --\nDigite o nome de quem ira utilizar a conta: ");
        try {
        this.titular = sc.next();
        }catch(InputMismatchException e){
        	
        }catch(Exception e){
        	System.out.println("Erro!");
        }
    }
    public void mostrarConta(){
        System.out.println("Número da conta: "+this.numero);
        System.out.println("Número da conta: "+this.titular);
        System.out.println("Número da conta: "+this.saldo);
    }
    public void Sacar(){
        this.saldo-= qtd;
    }
    public void Depositar(){
        this.saldo+= qtd;
    }
}
