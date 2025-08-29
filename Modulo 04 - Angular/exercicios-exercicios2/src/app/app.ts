import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Especificacoes } from "./paginas/especificacoes/especificacoes";
import { Roteamento } from "./roteamento/roteamento";

@Component({
  selector: 'app-root',
  imports: [Roteamento],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('exercicios-exercicios2');
}
