import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String>produtos = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Supermercado");
        while(true){
            System.out.println("Oque deseja comprar");
            System.out.println("1 - Arroz\n2 - Feijão\n3 - Macarrão\n4 - Alface\nV - Ver compras\nS - Sair");
            String op = sc.next();
            if(op.equals("S")){break;}
            switch(op){
                case "1":
                    produtos.add("Arroz");
                    break;
                case "2":
                    produtos.add("Feijão");
                    break;
                case "3":
                    produtos.add("Macarrão");
                break;
                case "4":
                    produtos.add("Alface");
                    break;
                case "V":
                    vercompras(sc);
                    break;

            }

        }

        }
        public static void vercompras (Scanner sc){
            for(String produto : produtos){
                System.out.println(produtos.indexOf(produto)+" -  "+produtos);
            }
            }
        public static void pagar(Scanner sc){
            vercompras(sc);
            System.out.println("Digite o indice do nome que deseja remover:");
            try{
                int i = sc.nextInt();
                produtos.remove(i);
            }catch (Exception e){
                System.out.println("erro");
            }

        }
        }

