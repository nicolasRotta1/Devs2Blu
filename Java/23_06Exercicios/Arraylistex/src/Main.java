import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static ArrayList<String> nomes = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lista de nomes!!!");
        while (true) {
            System.out.println("N - Adicionar novo nome\nV - Ver nomes\nR - Remover nome\n0 - Sair");
            String menu = "";

            try {
                menu = sc.next();
            } catch (Exception e) {
                System.out.println("Entrada inválida");
            }

            if (menu.equals("0")) {
                break;
            }
            switch (menu.toLowerCase()) {
                case "n":
                    adicionarnome(sc);
                    break;
                case "v":
                    mostrarnomes();
                    break;
                case "r":
                    removernome(sc);
                    break;
                default:
                    System.out.println("erro");
                    break;
            }
            System.out.println();
        }
    }

        public static void adicionarnome(Scanner sc) {
        try {
            System.out.println("Digite o novo nome: ");
            String nome = sc.next();
            nomes.add(nome);
        }catch (Exception e) {
            System.out.println("erro");
        }

        }
        public static void mostrarnomes(){
            for(String nome : nomes){
                System.out.println(nomes.indexOf(nome)+" - "+nome);
            }
        }
        public static void removernome(Scanner sc){
        mostrarnomes();
            System.out.println("Digite o indice do nome que deseja remover:");
            try{
            int i = sc.nextInt();
            nomes.remove(i);
            }catch (Exception e){
                System.out.println("erro");
            }

        }
}