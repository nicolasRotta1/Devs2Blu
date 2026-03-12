import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Ex01 } from "./ex01/ex01";

@Component({
  selector: 'app-root',
  imports: [Ex01],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('exercicios-angular');
}
