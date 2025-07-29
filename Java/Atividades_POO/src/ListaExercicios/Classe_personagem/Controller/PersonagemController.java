package ListaExercicios.Classe_personagem.Controller;

import ListaExercicios.Classe_personagem.Models.Personagem;

public class PersonagemController {
    public void exibirDados(Personagem personagem){
        System.out.println("Nome: "+personagem.getNome());
        System.out.println("Classe: "+personagem.getClasse().getNome());
        System.out.println("Nível: : "+personagem.getLevel());
    }
}
