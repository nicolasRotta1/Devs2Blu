package ListaExercicios.Classe_personagem.Controller;

import ListaExercicios.Classe_personagem.Models.Classe;

public class ClasseController {
    public void exibirDados(Classe classe){
        System.out.println("Nome: "+classe.getNome());
        System.out.println("Habilidades: "+classe.getHabilidades());
    }
}
