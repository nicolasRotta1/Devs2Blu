import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria banco = new ContaBancaria();
        banco.cadastrar(sc);
        banco.menu(sc);
    }
}