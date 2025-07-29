import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<String> alunos = new ArrayList<>();
        System.out.println("Faça um sorteio aqui!!!");
        while(true){
            System.out.println("Digite o nome do aluno ou 0 para sortear: ");
            String nome = sc.next();
            if(nome.equals("0")){break;}
            alunos.add(nome);
        }
        int sorteado = rand.nextInt(alunos.size());
        System.out.println("O aluno foi: " + alunos.get(sorteado));

    }
}