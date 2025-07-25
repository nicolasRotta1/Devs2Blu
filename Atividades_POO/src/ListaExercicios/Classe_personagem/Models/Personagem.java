package ListaExercicios.Classe_personagem.Models;

import java.util.Random;
import java.util.Scanner;

public class Personagem {
    Scanner sc = new Scanner(System.in);
    private int id;
    private String nome;
    private Classe classe;
    private int level;

    public Personagem(String nome, Classe classe, int level) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.classe = classe;
        this.level = level;
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void listarHabilidades(Scanner sc){

    }

    public void usarHabilidade(Scanner sc){
        System.out.println("Qual Habilidade deseja usar?");
        int i = 0;
        for (Habilidade habilidade : classe.getHabilidades()){
            System.out.println( i+" - "+habilidade.getNome());
            i+= 1;
        }
       int habilit = sc.nextInt();
        System.out.println("Usando a habilidade "+this.getClasse().getHabilidades().get(habilit).getNome());
    }
}
