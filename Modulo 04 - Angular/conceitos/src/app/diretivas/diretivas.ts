import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { EventoMouse } from '../minha-diretiva/evento-mouse';

@Component({
  selector: 'app-diretivas',
  imports: [CommonModule, EventoMouse],
  templateUrl: './diretivas.html',
  styleUrl: './diretivas.css'
})
export class Diretivas {
  //Vetor contendo a situação dos alunos na escola
  alunos:string[] = ['aprovado', 'aprovado', 'reprovado', 'aprovado'];

  //Váriaveis
  corFonte:string = 'yellow';
  corFundo:string = 'green';

  //Objeto
  estilo = {
    'color':this.corFonte,
    'background-color':this.corFundo
  }

  //Função para alterar as propriedades CSS
  alterarEstilo():void{
    this.corFonte = this.corFonte === 'yellow' ? 'black' : 'yellow';
    this.corFundo = this.corFundo === 'green' ? 'red' : 'green';

    this.estilo = {
      'color':this.corFonte,
      'background-color':this.corFundo
  }
  }
}
