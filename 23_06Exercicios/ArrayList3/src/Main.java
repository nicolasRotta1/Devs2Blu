import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();
        while(true){
            System.out.println("Digite uma palavra ou digite fim para encerrar");
            String palavra = sc.next();
            if(palavra.equals("fim")){
                break;
            }else{
                palavras.add(palavra);
            }

        }
        for(String palavra : palavras){
            System.out.println(palavra);

        }
        System.out.println("Foram digitadas "+palavras.size()+" palavras");
        }
    }
