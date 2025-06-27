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

    public void cadastrar(Scanner sc){
        System.out.println("-- Cadastro de conta bancaria --\nDigite o nome de quem ira utilizar a conta: ");
        this.titular = sc.next();

    }
    public void mostrarConta(){
        System.out.println("Número da conta: "+numero);
        System.out.println("Número da conta: "+titular);
        System.out.println("Número da conta: "+saldo);
    }
    public void Sacar(){
        this.saldo-= qtd;
    }
    public void Depositar(){
        this.saldo+= qtd;
    }
}
