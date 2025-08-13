import { Component } from '@angular/core';

@Component({
  selector: 'app-primeiro-componente',
  imports: [],
  templateUrl: './primeiro-componente.html',
  styleUrl: './primeiro-componente.css'
})
export class PrimeiroComponente {
  // Variável
  texto:string = 'Aprendendo Angular';

  // Função para retornar um texto
  funcaoTexto():string {
    return 'Exibindo um texto via função!';
  }

  /*
     TIPOS DE DADOS - TS
     string -> texto
     number -> número
     boolean -> true/false
     any -> qualquer tipo

     PARA FUNÇÕES, PODEMOS UTILIZAR VOID
      void -> função sem retorno
  */
}
