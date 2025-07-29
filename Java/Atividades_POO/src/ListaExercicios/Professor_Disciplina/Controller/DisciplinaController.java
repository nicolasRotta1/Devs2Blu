package ListaExercicios.Professor_Disciplina.Controller;

import ListaExercicios.Professor_Disciplina.Models.Disciplina;

public class DisciplinaController {
    public void exibirDados(Disciplina disciplina){
        System.out.println("Id: "+disciplina.getId());
        System.out.println("Nome: "+disciplina.getNome());
        System.out.println("Carga Horaria: "+disciplina.getCargaHoraria());
    }

}
