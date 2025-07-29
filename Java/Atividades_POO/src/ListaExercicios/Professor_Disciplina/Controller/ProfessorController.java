package ListaExercicios.Professor_Disciplina.Controller;

import ListaExercicios.Professor_Disciplina.Models.Professor;

public class ProfessorController {
    public void exibirDados(Professor professor){
        System.out.println("Id: "+professor.getId());
        System.out.println("Nome: "+professor.getNome());
        System.out.println("Disciplina: "+professor.getDisciplina().getNome());
        System.out.println("Sala: "+professor.getSalaDeAula().getNome());
    }
}
