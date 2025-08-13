import { Component } from '@angular/core';

@Component({
  selector: 'app-data-bindings',
  imports: [],
  templateUrl: './data-bindings.html',
  styleUrl: './data-bindings.css'
})
export class DataBindings {
  //Imagem
  imagem: string = 'Magal.webp';

  // Função para alterar a imagem
  funcao():void{
    this.imagem = this.imagem === 'Magal.webp' ? 'Bravo.webp' : 'Magal.webp';
  }
}
